# Java-OOP-Review

To review OOP concepts in Java

## Concepts To Review

1. Abstraction ✅
    (See notes in Obsidian)
2. Encapsulation ✅
    - What's the difference between Encapsulation and Abstraction?
        - The difference is that encapsulation is a concept embedded in abstraction. It accomplishes the goal of hiding internal details and data and unifying those components. This enables a separation of specification and implementation by encapsulating pertinent data and presenting an interface to only access the relevant parts while avoiding getting bogged down in implementation details.
3. Inheritance ✅
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
4. Polymorphism ✅
    - What's the difference between *overriding* and *overloading*?
        - overriding refers to taking a method and re-writing or re-implementing the method body, maintaining the same signature and contents. This is often conjoined with the idea of inheritance in which an abstract or interface method is overrided at the subclass level and actually implemented there.
            - rephrased, its multiple instances of a method with the same method signature, dispersed across a class hierarchy (superclass and subclass)
        - overloading refers to multiple instances of a method within a certain class with differing method signatures. This allows you to activate a method with differing arguments.
5. Dependency Injection
    - What is dependency injection?
        - So, transferring the task of creating the object to someone else and directly using the dependency is called dependency injection.
        - "Dependency Injection is like when u need to perform something u don’t know exactly, just ask (inject) the person (dependency) who knows it better."
        - "Dependency Injection is a design pattern that allows you to decouple your code from the implementation of a dependency. It is a way to implement the Inversion of Control (IoC) principle."
    - Why is it useful?
        - It allows you to decouple your code from the implementation of a dependency. It is a way to implement the Inversion of Control (IoC) principle.
        - It allows you to swap out dependencies without having to change the code that uses them.
        - It allows you to mock dependencies for testing.
        - Helps to reduce coupling between classes - dependencies will now be injected into the class.
        - Dependencies can be injected at runtime, instead of compile time.
    - What are the three types of dependency injection?
        - Constructor Injection
            - dependies provided through a class constructor
        - Setter Injection
            - the client exposes a setter method that the injector uses to inject the dependency
        - Interface Injection
            - the dependency provides an injector method that will inject the dependency into any client passed to it. The client then provides a setter method that will accept the dependency.
    - What must the DI do?
        - Create the objects
        - Know which classes require those objects
        - Provide them all those objects
        - Look into changes to objects
    - Benefits of DI
        - Helps with Unit Testing
        - initializing of dependencies is done by the injector component, so less boiler plate
        - extending application becomes easier
        - loose coupling
    - Disadvantages of DI
        - complex to learn
        - compile time errors pushed to run-time
6. SOLID - Object Oriented Design Principles that help design maintainable and extendable code. Help to avoid code smells, refactoring, and aligned with Agile development.
    - Pulling from [this article](https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design#toc-single-responsibility-principle)
    - S - Single Responsbility Principle
        - a class should have only one job. This means not overloading one class with the logic for multiple functions. This can be achieved by creating multiple classes that each have a single responsibility. That means not passing in a bunch of arguments to the function that determine multiple options and responsibilities that alter the output. For example, being able to output `JSON` and other outputs for an `AreaCalculator` class.
    - O - Open Closed Principle
        - Objects/Entities should be open for extension without modifying them. For example, you can have a class `AreaCalculator` that knows how calculate area for both `Square` and `Circle.` However, if you have a custom built calculator that uses conditionals to determine the shape type, any introduction of new subclass (shape class) will result in another edit to the original `AreaCalculator` class. Instead, we want to define the calculate area method in an abstracted form, grabbing the `area()` function from each shape class itself. But how can we determine the object pass in is of a `Shape` class, and that it will output correctly? This is where an **interface** will come in. Make it so that all the `Shape` classes implement the interface with function to compute area.
    - L - Liskov Substitution Principle
        - Every subclass or derived class should be substitutable for their parent or base class. For example, if we have a class `VolumeCalculator` which is a sublclass of `AreaCalculator`, and both classes implement `sum()`, the return type of this function for both classes should be identical (not an array for one and integer for the other, for example).
    - I - Interface Segregation Principle
        - Client should never be forced to implement an interface that they never use, nor be forced to depend on methods they don't use. For example, if you have a `ShapeInterface` class to model force a shape to implement `area`, and you now want to introduce 3D shapes like cubes and spheres, this would force non 3D shapes to implement a `volume()` method if added to the contract for `ShapeInterface`. This means creating another class, `ThreeDimensionalShapeInterface` with a `volume()` contract. Then you can create a generic `ManageShapeInterface` such that classes that implement both `ThreeDimensionalShapeInterface` can implement it, and all these shapes can be managed in a single API.
    - D - Dependency Inversion Principle
        - Entities must depend on abstractions, not concretions. a high-level module should not depend on a low-level module.
        - Use an interface as an abstracted connection between high and low level modules. Thus, when a high-level module interacts with a low-level module, you can replace references to the low-level module with the interface.
        - This is known as decoupling.

TODO make a make file to clean class files and a compile/run script
TODO Using SOLID concepts refactor the `Student` class.