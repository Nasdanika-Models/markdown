
```drawio-resource
../markdown.drawio
```

[TOC levels=6]

A pragmatic Ecore metamodel for Markdown documents.
Load Markdown sources as standard EMF resources, transform them to domain-specific models via filename pipelines,
and use Markdown as the authoring surface for cheap DSLs - without writing custom parsers.

**Template repositories:**
- [markdown-ecore-doc](https://github.com/Nasdanika-Templates/markdown-ecore-doc) - author Ecore metamodels in Markdown via the `.ecore.md` filename pipeline.
- [product-management](https://github.com/Nasdanika-Templates/product-management-modernization) - a worked legacy-modernization example using the [Product Management Model](https://product-management.models.nasdanika.org/) authored in Markdown.

## Executive summary

A persistent question in model-driven development has been *what is the authoring surface?* The canonical answers - programmer DSLs (Xcore, Xtext), hierarchical data formats (YAML, JSON), visual editors (Sirius, GMF) - each carry trade-offs the framework's designers know and consumers discover later.
Programmer DSLs are precise and powerful but exclude non-engineers.
YAML is universal and accessible but visually flat and indentation-fragile.
Visual editors are intuitive for spatial problems and frustrating for everything else.

The Markdown model is the substrate for a different answer: the authoring surface is *Markdown with light structural conventions*, the same format engineers write README files in and stakeholders write design documents in.
Headings carry structure; attribute lists (kramdown / pandoc syntax) carry qualifiers; fenced blocks carry richer configuration; standard Markdown links carry cross-references.
Loaded as an EMF resource, transformed via standard EMF mechanisms, the Markdown document becomes an instance of whatever target metamodel the consumer needs.

Three properties make this approach particularly well suited to the current moment:

- **LLMs are fluent in Markdown out of the box.** Every model trained on internet-scale text produces Markdown natively. Custom DSL syntaxes - even YAML schemas - require teaching the model the format; Markdown is what the model already produces well. AI-assisted authoring works without per-format prompt engineering.
- **Subject-matter experts can write Markdown without learning a programming language.** Most knowledge workers write Markdown weekly - in pull requests, design documents, Notion, Obsidian. The friction of authoring a structured model in Markdown is much lower than authoring the same model in YAML.
- **The metamodel itself can be authored in Markdown.** The format's documentation is an instance of the format. New domain-specific models become reachable without per-model tooling work.


## Overview video

Below is an AI-generated overview video:

<div style="max-width: 720px" class="embed-responsive embed-responsive-16by9">
    <iframe src="https://www.youtube.com/embed/iBPRHs0KXlA?si=_qevFzetRGW9V9x3" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
</div>

## What it does

Two related things that compose.

### Markdown as EMF resource

A `.md` file loaded through `MarkdownResourceFactory` produces a typed EMF model - a `Document` at the root containing `Container` elements (organized by heading level), with `Paragraph`, `List` and `ListItem`, `Link`, `FencedBlock`, and the rest of the structural elements. Attribute lists on headings and other blocks parse into an attributes list alongside the element's content. The result is queryable, navigable, transformable, and citable using the same machinery any other Ecore model uses - `getContents()`, `eAllContents()`, [EMF Compare](https://eclipse.dev/emf/compare/), NSML transformations, persistence to XMI / JSON / YAML, federation across resources.

The Markdown source is the canonical form.
The EMF model is a projection derived deterministically from the source.
Round-tripping back to Markdown is not currenlty supported, but might be added later using the approach similar to the one in the [Source Engineering Model](https://source-engineering.models.nasdanika.org/diagram.html).

### Filename pipelines for transformation

A filename like `my-product.pm.md` declares a *content-loading pipeline* - read right-to-left, the rightmost qualifier is the source format, the leftmost is the final target. `my-product.pm.md` loads as Markdown through the `.md` factory, then is transformed to a Product Management model by the filter registered against the `.pm` qualifier. `architecture.ecore.md` loads as Markdown and is transformed to an Ecore model. `my-system.html.pm.md` chains further - Markdown to Product Management model to HTML.

The chain is composed by the [Nasdanika Capability framework](https://docs.nasdanika.org/capability/). New (source-format, target-model) pairs are added by registering a `ResourceContentFilter` capability against the appropriate qualifier; the filter chain assembles itself based on the filename.
Filters can be implemented as hand-written Java for complex cases or as declarative [NSML](https://github.com/Nasdanika-Models/nasdanika-semantic-mapping-language) transformations for cases where mapping rules suffice.

The client code does not see the chain. `ResourceSet.getResource(URI.createURI("my-product.pm.md"))` returns the target model directly. The conversion machinery is hidden behind the standard EMF abstraction.

## Use cases

### Subject-matter experts as authors

The lowest-friction use case. An SME writes a Markdown document about what they know - a persona description, a process narrative, an architecture decision, a domain model.
Headings organize the content the way the SME would organize a normal document.
The structural conventions of the target model determine which headings map to which features, and the SME learns those conventions from worked examples rather than from a specification document.
The SME never opens a YAML file; the SME never sees the target Ecore metamodel; the SME maintains the Markdown going forward, and the derived model stays in sync as a side effect of normal authoring work.

### Hybrid pipelines - SMEs and technical enrichment

A common production pattern. The SME writes the prose; a technical author or AI annotates the structure by adding attribute lists to headings and fenced configuration blocks to sections that need them.
[Fenced divs](https://github.com/jgm/commonmark-hs/blob/master/commonmark-extensions/test/fenced_divs.md) (`:::`) can be used to build hierarches of unlimited depth if 6 levels of headings are not enough. 
The SME maintains the document; the structural annotations persist across edits because they live on the headings the SME owns.
New SMEs can be onboarded without understanding the formal model - they read the document the way they would read any Markdown document and edit it the same way.

### AI-assisted generation

LLM-fluency-in-Markdown unlocks a generation pattern that previously required custom prompt engineering for each target schema.
The prompt contains a few worked examples of the target Markdown convention, a narrative description of the new instance the human wants to create, and the request to produce a new Markdown document matching the convention.
The LLM produces a structurally correct draft on the first try far more often than the same setup against a YAML schema - because the LLM has seen orders of magnitude more Markdown than it has seen of any particular YAML schema.
The human reviews the draft, refines the narrative for the next round, and the loop converges quickly.

This is the elicitation pattern that makes agent-driven model building practical: an agent interviewing a stakeholder produces output the stakeholder can read (because it is Markdown) and the system can map (because it is Markdown-with-conventions). One artifact serves both audiences.

### Wikis and existing content

Confluence spaces, Notion databases, GitHub repository wikis, and most internal documentation are already Markdown-shaped or close to it.
The Markdown model is the entry point for *progressive formalization*: existing content can be loaded as EMF resources without rewriting, mapped to domain models in stages, and gradually annotated with attribute lists where formalization adds value.
The wiki stays where it is; the authoring habits do not change; the content becomes machine-readable and citable as a side effect.

## Template repositories

Two starter templates demonstrate the pattern in concrete form. Each is a GitHub template repository - click *Use this template* to fork, edit Markdown, push, and get a published documentation site for free.

### [Markdown to Ecore](https://github.com/Nasdanika-Templates/markdown-ecore-doc)

[`family.ecore.md`](https://github.com/Nasdanika-Templates/markdown-ecore-doc/blob/main/family.ecore.md) file authors an Ecore metamodel in Markdown; the GitHub Action runs the Nasdanika CLI's loading pipeline, produces an Ecore model, and publishes the rendered documentation site.
Use this template to write your own metamodels in Markdown - the recursion of the format documenting itself is a demonstration of why Markdown-based DSLs scale across domains without per-domain tooling work.

### [Product Management Model - Legacy Modernization](https://github.com/Nasdanika-Templates/product-management)

A larger worked example demonstrating the [Product Management model](https://product-management.models.nasdanika.org/) authored in Markdown for a legacy-modernization scenario.
The personas, concerns, capabilities of the modernization effort live in Markdown documents that read as normal architecture documentation; the model is derived deterministically; the documentation site is generated from the model.
Use this template as the starting point for any product-management-shaped modeling work - capability catalogs, internal platform documentation, AI adoption portfolios, and the modernization scenario itself.

## On cheap DSLs

Standards bodies are expensive - committees, RFCs, vendor wrangling, years to adoption.
By the time a standard arrives, the problem has shifted and the vendors who originally agreed to it have moved on to extensions the standard does not cover. 
*While the grass grows, the horse starves.*

The Markdown model lets any author publish a *cheap DSL* - a Markdown convention plus a transformation that maps the convention to a formal model.
The cost of producing a DSL drops from *"write a parser, design a syntax, build a tooling chain, document the format, hope for adoption"* to *"write a Markdown convention, write a mapping rule, publish both as a small Maven artifact."* 
Consumers can adopt or compete with the convention on equal structural terms.
The ecosystem sorts out which DSLs find their audience, the same way Maven Central, npm, PyPI, and the GitHub ecosystem sort out which libraries find theirs.

This is the same property that has made code-level federation work for two decades.
Multiple libraries to parse HTML, to format JSON, to handle dates, to send HTTP requests - each individually authoritative within its declared scope, none requiring a committee to bless its existence, all federated through ordinary dependency resolution.
The Markdown model brings the same pattern to *DSL definition*: many cheap DSLs in a federated graph, each clearly bounded, with consumers picking what fits their problem and their audience.
The Product Management model is one such cheap DSL - built specifically for persona-driven capability modeling, not trying to be a universal strategy framework.
Other domains (architecture, ADRs, compliance documentation, organizational design, personal knowledge bases) admit similar treatments.
Each new domain's DSL is a small Markdown convention plus a small transformation, written in a sitting and published as a Maven artifact, available to consumers who would never have invested in a heavyweight modeling toolchain for the same purpose.

## Get started

Add the dependency:

```xml
<dependency>
    <groupId>org.nasdanika.models.markdown</groupId>
    <artifactId>filters</artifactId>
    <version>${nasdanika.version}</version>
</dependency>
```

Register the resource factory:

```java
CapabilityLoader capabilityLoader = new CapabilityLoader();
ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);       
ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);

File markdownFile = new File("src/test/resources/family.ecore.md").getCanonicalFile();
Resource markdownResource = resourceSet.getResource(URI.createFileURI(markdownFile.getAbsolutePath()), true);       
EPackage ePackage = (EPackage) markdownResource.getContents().get(0);

File ecoreFile = new File("target/family.ecore").getCanonicalFile();
Resource ecoreResource = resourceSet.createResource(URI.createFileURI(ecoreFile.getAbsolutePath()));
ecoreResource.getContents().add(EcoreUtil.copy(ePackage));
ecoreResource.save(null);
```

For filename pipelines (e.g. `.pm.md`, `.ecore.md`), use `ResourceContentFilter` capabilities - the template repositories above show the complete pattern.

For the broader narrative on Markdown as a DSL host language and the cross-format composition pattern, see the Medium piece *Markdown-based DSLs and beyond* (link will be added when the piece is published).

## Related Nasdanika projects

- **[Nasdanika Capability framework](https://docs.nasdanika.org/capability/)** - provides the registration mechanism for `ResourceContentFilter` capabilities.
- **[NSML](https://github.com/Nasdanika-Models/nasdanika-semantic-mapping-language)** - the declarative transformation language can be used to implement filters, removing the need to write Java for cases where mapping rules suffice.
- **[Product Management model](https://product-management.models.nasdanika.org/)** - one of use cases of Markdown authoring; demonstrates the full pattern from Markdown source to federated documentation site.

## License

EPL-2.0
