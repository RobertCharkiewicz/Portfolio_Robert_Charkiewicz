public class Lekcja2_zadanie{

    public static void main(String[] args) {

//Zadanie 1
        //1
        double zmienna;

        double zmienna1 = 50;
        //2
        double zmienna2 = 30;
        //3
        double wynikDodawaniaImnozenia = (zmienna1 + zmienna2) * 30;
        System.out.println(wynikDodawaniaImnozenia);

        //4
        double wynikDzielenia = wynikDodawaniaImnozenia / 70;
        System.out.println(wynikDzielenia);

        //5
        boolean resztaZdzieleniaWiekszaNiz15 = true;

        double resztaZdzielenia = wynikDodawaniaImnozenia % 70;

        if(resztaZdzielenia > 15) {
            System.out.println("Reszta z dzielenia > 15");
        }
    }
}
