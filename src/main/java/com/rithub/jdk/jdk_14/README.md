# JDK 14 Documentation

## Introduction
Java Development Kit (JDK) 14, released on March 17, 2020, introduced several new features, enhancements, and performance improvements to the Java programming language and platform. JDK 14 aimed to improve developer productivity, enhance performance, and provide better support for modern software development practices.

## Major Features

### 1. Switch Expressions (Standard)
- Switch expressions, introduced as a preview feature in JDK 12 and enhanced in JDK 13, were made a standard feature in JDK 14.
- Switch expressions allow developers to use the `yield` keyword to return a value from a switch case, making the code more concise and readable.

### 2. Records (Preview)
- Introduction of records as a preview feature to provide a compact way to define classes that are transparent holders for immutable data.
- Records simplify the definition of data-centric classes by automatically generating accessor methods, constructors, `equals()`, `hashCode()`, and `toString()` methods.

### 3. Pattern Matching for `instanceof` (Preview)
- Introduction of pattern matching for the `instanceof` operator as a preview feature.
- Pattern matching simplifies the common use case of checking the type of an object and casting it to that type in a single operation.

### 4. Helpful NullPointerExceptions
- Enhancement of NullPointerException messages to provide more helpful diagnostic information.
- NullPointerException messages now include the name of the variable that was `null`, making it easier to identify the cause of the exception.

### 5. JFR Event Streaming
- Introduction of Java Flight Recorder (JFR) event streaming to enable continuous monitoring and analysis of JVM events.
- JFR event streaming allows applications to stream JVM events in real-time to external systems for analysis and monitoring.

## Additional Enhancements

### 1. Non-Volatile Mapped Byte Buffers
- Introduction of non-volatile mapped byte buffers to provide better performance and consistency guarantees for memory-mapped files.
- Non-volatile mapped byte buffers ensure that changes made to memory-mapped files are visible to other processes and threads immediately.

### 2. Packaging Tool (Incubator)
- Introduction of the jpackage tool as an incubator feature to package self-contained Java applications.
- The jpackage tool simplifies the creation of platform-specific packages (such as MSI, RPM, and DEB) for distributing Java applications.

### 3. NUMA-Aware Memory Allocation for G1
- Enhancement of the Garbage-First (G1) garbage collector to support NUMA (Non-Uniform Memory Access) systems.
- NUMA-aware memory allocation improves performance and scalability on systems with multiple memory domains.

## Development Tools
- JDK 14 shipped with a comprehensive set of development tools, including `javac`, `java`, `jar`, and others.
- Tools facilitated compilation, execution, packaging, and debugging of Java programs.

## Community and Industry Impact
- JDK 14 represented a significant milestone in the evolution of the Java platform, introducing several features and enhancements aimed at improving developer productivity, performance, and scalability.
- Records, pattern matching, JFR event streaming, and the packaging tool provided developers with new tools and capabilities for building modern Java applications.

## Conclusion
JDK 14 introduced several new features and enhancements to the Java platform, aimed at improving developer productivity, performance, and scalability. With the introduction of records, pattern matching, JFR event streaming, and other features, JDK 14 reinforced Java's position as a versatile and powerful programming language for building modern, scalable, and efficient applications.
