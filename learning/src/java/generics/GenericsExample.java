package generics;

import generics.boundedgenerics.AnimalPrinter;
import generics.boundedgenerics.Cat;
import generics.boundedgenerics.Dog;

public class GenericsExample {
    public static void main(String args[]){
        Printer<Integer> integerPrinter = new Printer<>(5);
        integerPrinter.print();   // output = print::: 5

        Printer<String> stringPrinter = new Printer<>("Hello");
        stringPrinter.print();   // output = print::: Hello

        Printer<Double> doublePrinter = new Printer<>(45.34);
        doublePrinter.print();   // output = print::: 45.34

        Printer<Long> longPrinter = new Printer<>(5L);
        longPrinter.print();  // output = print::: 5

        MultiPrinter<Integer, String> multiPrinter = new MultiPrinter<>(5, "Hello");
        multiPrinter.print(); // output = print::: 5 : Hello

//        BOUNDED GENERICS
        AnimalPrinter<Cat> animalPrinter1 = new AnimalPrinter<>(new Cat("Jim", "brown", 2));
        animalPrinter1.print();
        AnimalPrinter<Dog> animalPrinter2 = new AnimalPrinter<>(new Dog("Rocky", "black", 5));
        animalPrinter2.print();
    }
}
