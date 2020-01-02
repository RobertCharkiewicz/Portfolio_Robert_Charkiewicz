package Lekcja5.Lekcja5_zadania6_7;

import java.util.ArrayList;
import java.util.List;

public class Samolot implements FlyingObject {

    String nazwa;
    boolean jestOdrzutowy;

    public Samolot(String nazwa, boolean jestOdrzutowy) {
        this.nazwa = nazwa;
        this.jestOdrzutowy = jestOdrzutowy;
    }

    @Override
    public void start() {
        System.out.println("Samolot wystartowal");
    }

    public void przyspiesz() {
        System.out.println("Samolot przyspieszyl");
    }

    public void laduj() {
        System.out.println("Samolot wyladowal");
    }

    public void lecProsto() {
        System.out.println("Samolot leci prosto");
    }

    public void lecWPrawo() {
        System.out.println("Samolot leci w prawo");
    }

    public void lecWLewo() {
        System.out.println("Samolot leci w lewo");
    }

}