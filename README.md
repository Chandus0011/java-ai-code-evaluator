# Java AI Code Evaluator

A lightweight static analysis and rule-based validation engine built in Java to evaluate LLM-generated code snippets for structural integrity, logging standards, and exception-handling anti-patterns.

## Features
- **Structural Validation:** Verifies presence of top-level class or interface declarations.
- **Anti-Pattern Detection:** Flags empty `catch` blocks and raw `System.out.println` usage in favor of structured logging (SLF4J).
- **Extensible Rule Engine:** Designed to easily plug in custom AST or regex-based verification rules for automated AI code benchmarking.

## Tech Stack
- **Language:** Java 17+
- **Architecture:** Modular rule-based evaluation pipeline
