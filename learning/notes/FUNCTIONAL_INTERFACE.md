## Functional Interface
Functional interface is introduced in Java 8 to support functional programming concepts.
They serve as the basis for lambda expressions and method references.

Here are the main characteristics of functional interfaces:
### Single Abstract Method (SAM):
Functional interfaces have exactly one abstract method.
This single method defines the contract for the interface, and it is the method that needs to be implemented by the implementing classes.

### Default and Static Methods:
Functional interfaces can have default and static methods in addition to the single abstract method.
Default methods provide default implementations within the interface itself, allowing them to be optionally overridden by implementing classes.
Static methods offer utility methods associated with the interface.

### Annotation:
Java provides the @FunctionalInterface annotation to explicitly mark an interface as a functional interface.
While not mandatory, using this annotation helps prevent accidental addition of more than one abstract method in the interface.
If an interface annotated with @FunctionalInterface contains more than one abstract method, it results in a compilation error.

## List of functional Interface in java
1. Consumer<T>: Represents an operation that accepts a single input argument of type T and erforms some operation without returning any result.
2. Supplier<T>: Represents a supplier of results. It does not take any arguments but provides a result of type T.
3. Function<T, R>: Represents a function that accepts one argument of type T and produces a result of type R.
4. Predicate<T>: Represents a predicate (boolean-valued function) of one argument.
5. UnaryOperator<T>: Represents an operation on a single operand of type T that produces a result of the same type as the operand.
6. BinaryOperator<T>: Represents an operation upon two operands of the same type, producing a result of the same type as the operands.
7. BiFunction<T, U, R>: Represents a function that accepts two arguments and produces a result.
8. BiPredicate<T, U>: Represents a predicate (boolean-valued function) of two arguments. 
9. BiConsumer<T, U>: Represents an operation that accepts two input arguments and performs some action. 
10. IntFunction<R>, LongFunction<R>, DoubleFunction<R>: Represents functions that accept an int, long, or double respectively and produce a result of type R. 
11. IntSupplier, LongSupplier, DoubleSupplier: Represents suppliers of int, long, or double values respectively. 
12. ToIntFunction<T>, ToLongFunction<T>, ToDoubleFunction<T>: Represents functions that accept an object of type T and produce an int, long, or double respectively.
13. IntConsumer, LongConsumer, DoubleConsumer: Represents operations that accept an int, long, or double respectively and perform some action. 
14. IntPredicate, LongPredicate, DoublePredicate: Represents predicates (boolean-valued functions) of int, long, or double respectively. 
15. IntUnaryOperator, LongUnaryOperator, DoubleUnaryOperator: Represents operations on a single operand of type int, long, or double respectively, producing a result of the same type as the operand.

These functional interfaces cover a wide range of use cases for functional programming in Java, 
providing a way to represent functions as first-class citizens and enabling a more functional style of programming.