package Lekcja5.Lekcja5_zadania6_7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Latawiec latawiec = new Latawiec("zielony", false);
        Ptak ptak = new Ptak("bocian", 120);
        Samolot samolot = new Samolot("Boeing737", true);

        latawiec.start();
        ptak.start();
        samolot.start();
    }

    static class Barwy<T extends FlyingObject> {

        List<T> Kolory = new ArrayList<>();

        public void dodajDoBarwy(T t) {
            Kolory.add(t);
        }
    }
}