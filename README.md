# Java-OOP-Review

To review OOP concepts in Java

## Concepts To Review

1. Abstraction ✅
    (See notes in Obsidian)
2. Encapsulation ✅
    - What's the difference between Encapsulation and Abstraction?
        - The difference is that encapsulation is a concept embedded in abstraction. It accomplishes the goal of hiding internal details and data and unifying those components. This enables a separation of specification and implementation by encapsulating pertinent data and presenting an interface to only access the relevant parts while avoiding getting bogged down in implementation details.
3. Inheritance
    - What's the difference between composition and inheritance?
        - an inheritance relationship defines an "is-a" relationship between two classes. That is the subclass is a superclass, with some tweaks and possible differences. Whereas, a composition relationship between two classes indicates that one class is a component of another class, indicating a "has-a" relationship. For example, a car class has an engine class. There is no class hierarchy shared between these two classes.
    - What are the benefits and tradeoffs that come with each approach?
        - inheritance allows you to reuse code among related classes, unifying common methods and data fields and minimizing code re-use.
            - it is the tightest form of coupling in OOP
            - changing a base-class can have many unwanted side effects on its subclasses
        - composition allows modularity, in that there is no strong dependency between classes in a composition relationship, allowing components to be updated and modified flexibly without adhering to rules that an abstract or interface class must abide by.
            - more useful when building a class with multiple components with little overlap (little to no is-a relationships)
            - restructuring of a class-tree will create less side affects with a composition approach
            - design a class on what it does vs what it is
4. Polymorphism
    - What's the difference between *overriding* and *overloading*?
        - overriding refers to taking a method and re-writing or re-implementing the method body, maintaining the same signature and contents. This is often conjoined with the idea of inheritance in which an abstract or interface method is overrided at the subclass level and actually implemented there.
            - rephrased, its multiple instances of a method with the same method signature, dispersed across a class hierarchy (superclass and subclass)
        - overloading refers to multiple instances of a method within a certain class with differing method signatures. This allows you to activate a method with differing arguments.
5. Dependency Injection

TODO make a make file to clean class files and a compile/run script
