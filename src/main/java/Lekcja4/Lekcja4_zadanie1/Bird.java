package Lekcja4.Lekcja4_zadanie1;

public class Bird extends Animal {

    public Bird(String name, int numberOfLegs, int numberOfWings) {
        super(name, numberOfLegs, numberOfWings);
    }

    @Override
    public void fly() {
        System.out.print("Bird is flying, ");
    }

    @Override
    public void swim() {
        System.out.println("not swimming.");
    }
}