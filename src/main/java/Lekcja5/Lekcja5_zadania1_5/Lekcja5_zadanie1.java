package Lekcja5.Lekcja5_zadania1_5;

public class Lekcja5_zadanie1 {
    public static void main(String[] args) {

        int[] tablica = {1, 12, 3, -1, 0};
        int najmniejszaWartosc;
        najmniejszaWartosc = tablica[0];

        for (int i = 0; i < tablica.length; i++) {
            if (najmniejszaWartosc > tablica[i]) {
                {
                    najmniejszaWartosc = tablica[i];
                }
            }
        }
        System.out.println("Najmnniejsza wartosc w tablicy to: " + najmniejszaWartosc);
    }
}