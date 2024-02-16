# JDK 17 Documentation

## Introduction
Java Development Kit (JDK) 17, released on September 14, 2021, introduced several new features, enhancements, and performance improvements to the Java programming language and platform. JDK 17 aimed to improve developer productivity, enhance performance, and provide better support for modern software development practices.

## Major Features

### 1. Sealed Classes (Standard)
- Sealed classes, introduced as a preview feature in JDK 15, were made a standard feature in JDK 17.
- Sealed classes restrict which other classes may extend them, providing better encapsulation and maintainability.

### 2. Pattern Matching for switch (Standard)
- Pattern matching for the `switch` statement, introduced as a preview feature in JDK 12 and enhanced in subsequent releases, was made a standard feature in JDK 17.
- Pattern matching simplifies common code patterns by combining conditional checks and data extraction into a single operation.

### 3. Strongly Encapsulate JDK Internals by Default
- Enhancement of JDK modules to strongly encapsulate internal APIs by default.
- Strong encapsulation improves security and maintainability by preventing unauthorized access to internal JDK APIs and implementation details.

### 4. Foreign Function & Memory API (Incubator)
- Introduction of the Foreign Function & Memory API as an incubator feature.
- The Foreign Function & Memory API provides a modern, pure-Java approach to calling native code and interacting with native memory.

### 5. New macOS Rendering Pipeline
- Introduction of a new rendering pipeline for macOS using the Metal framework.
- The new rendering pipeline improves performance and reliability of graphics rendering on macOS systems.

## Additional Enhancements

### 1. Deprecate and Remove Applet API
- Deprecation and removal of the Applet API, which was previously marked as deprecated.
- The Applet API is no longer supported due to security concerns and declining usage.

### 2. Packaging Tool (JEP 392)
- Enhancement of the packaging tool to improve the packaging and distribution of Java applications.
- The packaging tool simplifies the creation of platform-specific packages for distributing Java applications.

### 3. Remove the Experimental AOT and JIT Compiler
- Removal of the experimental Ahead-of-Time (AOT) and Just-In-Time (JIT) compilers.
- The experimental compilers were removed due to limited adoption and maintainability concerns.

## Development Tools
- JDK 17 shipped with a comprehensive set of development tools, including `javac`, `java`, `jar`, and others.
- Tools facilitated compilation, execution, packaging, and debugging of Java programs.

## Community and Industry Impact
- JDK 17 represented a significant milestone in the evolution of the Java platform, introducing several features and enhancements aimed at improving developer productivity, security, and performance.
- Sealed classes, pattern matching for switch, and the Foreign Function & Memory API provided developers with new tools and capabilities for building modern Java applications.

## Conclusion
JDK 17 introduced several new features and enhancements to the Java platform, aimed at improving developer productivity, security, and performance. With the introduction of sealed classes, pattern matching, and other features, JDK 17 reinforced Java's position as a versatile and powerful programming language for building modern, secure, and scalable applications.
