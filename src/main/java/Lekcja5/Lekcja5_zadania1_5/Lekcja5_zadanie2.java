package Lekcja5.Lekcja5_zadania1_5;

import java.util.Arrays;

public class Lekcja5_zadanie2 {
    public static void main(String[] args) {

        int[] tablicaInt = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(tablicaInt));

        int[] odwrotne = new int[tablicaInt.length];
        int n = tablicaInt.length - 1;
        int j = n;
        for (int i = 0; i <= n; i++) {
            odwrotne[i] = tablicaInt[j];
            j--;
        }
        System.out.println(Arrays.toString(odwrotne));
    }
}