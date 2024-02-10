package generics.boundedgenerics;

public class AnimalPrinter<T extends Animal> {
    private final T animalData;

    public AnimalPrinter(T animalData) {
        this.animalData = animalData;
    }

    public void print() {
        System.out.println("Name::: " + animalData.getName());
        System.out.println("Color::: " + animalData.getColor());
        System.out.println("Age::: " + animalData.getAge());
    }
}
