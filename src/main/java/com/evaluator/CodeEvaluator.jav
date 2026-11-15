package com.evaluator;

import java.util.ArrayList;
import java.util.List;

/**
 * Evaluates AI-generated Java code snippets for basic structural validity,
 * anti-patterns, and performance best practices.
 */
public class CodeEvaluator {

    public List<String> evaluateSnippet(String codeSnippet) {
        List<String> feedback = new ArrayList<>();

        if (codeSnippet == null || codeSnippet.isBlank()) {
            feedback.add("Error: Empty or null code snippet.");
            return feedback;
        }

        if (!codeSnippet.contains("class ") && !codeSnippet.contains("interface ")) {
            feedback.add("Warning: Missing top-level class or interface declaration.");
        }

        if (codeSnippet.contains("System.out.println")) {
            feedback.add("Suggestion: Replace System.out.println with a structured logger (e.g., SLF4J).");
        }

        if (codeSnippet.contains("catch (Exception e) {}")) {
            feedback.add("Critical: Empty catch block detected; handle or log exceptions properly.");
        }

        if (feedback.isEmpty()) {
            feedback.add("Passed: Snippet meets baseline structural and quality checks.");
        }

        return feedback;
    }
}
