package Lekcja4.Lekcja4_zadanie1;

public class Fish extends Animal {

    public Fish(String name, int numberOfLegs, int numberOfWings) {
        super(name, numberOfLegs, numberOfWings);
    }

    @Override
    public void fly() {
        System.out.print("Fish is not flying, ");
    }

    @Override
    public void swim() {
        System.out.println("fish is swimming.");
    }
}