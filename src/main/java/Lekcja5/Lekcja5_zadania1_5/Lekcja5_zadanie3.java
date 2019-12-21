package Lekcja5.Lekcja5_zadania1_5;

public class Lekcja5_zadanie3 {

    public static void main(String[] args) {

        int[] tablica = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : tablica) {
            System.out.print(" " + x);
        }
        Lekcja5_zadanie3 xyz = new Lekcja5_zadanie3();
        System.out.println(xyz.toString());
    }

    public String toString() {
        return " -> to jest klasa XYZ ";
    }
}