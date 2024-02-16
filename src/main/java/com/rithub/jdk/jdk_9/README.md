# JDK 9 Documentation

## Introduction
Java Development Kit (JDK) 9, released on September 21, 2017, introduced significant features and enhancements to the Java programming language and platform. JDK 9 aimed to improve developer productivity, enhance performance, and provide better support for modern software development practices.

## Major Features

### 1. Module System (Project Jigsaw)
- Introduction of the Java Platform Module System (JPMS) for modularizing the Java SE platform.
- JPMS enables developers to create modular applications with better encapsulation and dependency management.
- Modules provide a way to define, encapsulate, and organize code and resources at a higher level than packages.

### 2. JShell (Read-Eval-Print Loop)
- Introduction of JShell, a command-line tool for interactive Java programming and experimentation.
- JShell allows developers to execute Java code snippets and evaluate expressions interactively without the need for compiling and running a complete Java program.

### 3. Reactive Streams API
- Introduction of the Reactive Streams API for asynchronous, non-blocking stream processing.
- Reactive Streams provide a standard API for handling streams of data with backpressure, enabling more efficient and scalable processing of asynchronous data streams.

### 4. HTTP/2 Client
- Introduction of a new HTTP client API for making HTTP requests and handling responses using HTTP/2.
- The HTTP/2 client API provides better performance, multiplexing, and server push capabilities compared to the legacy HttpURLConnection API.

### 5. Process API Updates
- Enhancements to the Process API for managing and interacting with native processes.
- The updated Process API allows developers to handle processes more effectively, including controlling, monitoring, and managing process streams.

## Additional Enhancements

### 1. Multi-Resolution Images
- Introduction of multi-resolution images to support high-DPI displays and responsive user interfaces.
- Multi-resolution images enable developers to provide images at different resolutions and scale them appropriately based on the display density.

### 2. Convenience Factory Methods for Collections
- Introduction of convenience factory methods for creating immutable collections in the java.util package.
- Factory methods simplify the creation of immutable lists, sets, and maps, making code more concise and readable.

### 3. Compact Strings
- Introduction of compact strings to reduce the memory footprint of String objects.
- Compact strings use a more efficient internal representation for storing Latin-1 characters, resulting in reduced memory consumption for String objects containing only Latin-1 characters.

## Development Tools
- JDK 9 shipped with a comprehensive set of development tools, including javac, java, jar, and others.
- Tools facilitated compilation, execution, packaging, and debugging of Java programs.

## Community and Industry Impact
- JDK 9 represented a significant milestone in the evolution of the Java platform, introducing several features and enhancements aimed at improving modularity, performance, and developer productivity.
- The Module System (Project Jigsaw) and JShell introduced new programming paradigms and tools for creating modular and interactive Java applications.
- The Reactive Streams API and HTTP/2 client provided better support for asynchronous and non-blocking communication in modern applications.

## Conclusion
JDK 9 introduced significant features and enhancements to the Java platform, aimed at improving modularity, performance, and developer productivity. With the introduction of the Module System, JShell, Reactive Streams API, and HTTP/2 client, JDK 9 reinforced Java's position as a versatile and powerful programming language for building modular, scalable, and interactive applications.
