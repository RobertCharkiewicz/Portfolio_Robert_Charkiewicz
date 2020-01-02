package Lekcja5.Lekcja5_zadania1_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lekcja5_zadanie5 {

    public static void main(String[] args) {

        List<String> lista1 = Arrays.asList("a", "b", "c", "d");
        List<String> lista2 = Arrays.asList("a", "b", "e", "d", "e", "f");
        System.out.println("Lista 1 " + lista1);
        System.out.println("Lista 2 " + lista2);
// wywolanie metody "compare":
        compare(lista1, lista2);
    }

    public static void compare(List lista1, List lista2) {

        List<String> dluga;
        List<String> krotka;
        List<String> wynik = new ArrayList<>();

        if (lista1.size() < lista2.size()) {
            krotka = lista1;
            dluga = lista2;
        } else {
            dluga = lista1;
            krotka = lista2;
        }
        for (int i = 0; i < krotka.size(); i++) {

            if (krotka.get(i) == dluga.get(i)) {
                wynik.add(krotka.get(i));
            }
        }
        System.out.println("wspolne " + wynik);
    }
}