package Lekcja4_zadanie1;

public class Animal {

    private String name;
    private int numberOfLegs;
    private int numberOfWings;

    public Animal(String name, int numberOfLegs, int numberOfWings) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.numberOfWings = numberOfWings;
    }

    public void swim() {
        System.out.println("The animal can't swimm");
    }

    public void fly() {
        System.out.println("The animal can't fly");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }
}