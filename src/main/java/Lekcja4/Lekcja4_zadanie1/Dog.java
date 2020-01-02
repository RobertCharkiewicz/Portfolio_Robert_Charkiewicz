package Lekcja4.Lekcja4_zadanie1;

public class Dog extends Animal {

    public Dog(String name, int numberOfLegs, int numberOfWings) {
        super(name, numberOfLegs, numberOfWings);
    }

    @Override
    public void fly() {
        System.out.print("Dog is nor flying ");
    }

    @Override
    public void swim() {
        System.out.println("either swimming.");
    }
}