package Lekcja4.Lekcja4_zadanie1;

public class Zoo {

    public static void main(String[] args) {
        Bird bird = new Bird("Bird", 0, 2);
        Dog dog = new Dog("Dog", 4, 0);
        Fish fish = new Fish("Fish", 0, 0);

        bird.fly();
        bird.swim();
        dog.fly();
        dog.swim();
        fish.fly();
        fish.swim();

    }
}