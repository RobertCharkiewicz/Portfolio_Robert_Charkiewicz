public class Lekcja2_zadanie {


    public static void main(String[] args) {

//Zadanie 1
        //1

        double zmienna1 = 50;

        //2
        double zmienna2 = 30;

        //3
        double wynikDodawaniaImnozenia = (zmienna1 + zmienna2) * 30;

        //4
        double wynikDzielenia = wynikDodawaniaImnozenia / 70;

        //5
        boolean resztaZdzieleniaWiekszaNiz15 = true;

        double resztaZdzielenia = wynikDodawaniaImnozenia % 70;

        if (15 < resztaZdzielenia) {
            System.out.println("Reszta z dzielenia wieksza niz 15");
        }


//Zadanie 2

        //1
        int a, b;
        a = 10;
        b = 20;
        boolean warunek = true;

        //2
        warunek = false;

        if (0 < a && 0 < b && warunek == false) {
            System.out.println("Tester");
        } else {
            System.out.println("Automatyczny");
        }

        //3
        int nrMiesiaca = 3;

        switch (nrMiesiaca) {
            case 1:
            case 2:
            case 12:
                System.out.println("Dla miesiaca nr: " + nrMiesiaca + " pora roku jest zima");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Dla miesiaca nr: " + nrMiesiaca + " pora roku jest wiosna");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Dla miesiaca nr: " + nrMiesiaca + " pora roku jest lato");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Dla miesiaca nr: " + nrMiesiaca + " pora roku jest jesien");
                break;
        }

        //4
        int podanyRok;
        podanyRok = 1600;

        if (podanyRok < 1 || podanyRok > 9999) {
            System.out.println("Podany rok: " + podanyRok + " jest poza zakresem. Podaj rok w zakresie: 1 - 9999");
        } else if (podanyRok % 4 == 0 && podanyRok % 100 != 0 || podanyRok % 400 == 0) {
            System.out.println("Podany rok: " + podanyRok + " jest rokiem przestepnym");
        } else {
            System.out.println("Podany rok: " + podanyRok + " nie jest rokiem przestepnym");
        }

        //5 - kod bez metody:

        int miesiacNr = 2;
        int rokNr = 1600;

        switch (miesiacNr) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("W miesiacu " + miesiacNr + " w roku " + rokNr + " ilosc dni wynosi 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("W miesiacu " + miesiacNr + " w roku " + rokNr + " ilosc dni wynosi: 30");
                break;
            case 2:
                if (rokNr % 4 == 0 && rokNr % 100 != 0 || rokNr % 400 == 0) {
                    System.out.println("W miesiacu " + miesiacNr + " w roku " + rokNr + " ilosc dni wynosi: 29");
                } else {
                    System.out.println("W miesiacu " + miesiacNr + " w roku " + rokNr + " ilosc dni wynosi: 28");
                }
        }
        // kod z metoda poprawiony po konsultacji z Bartkiem:

        int IloscDniWmiesiacu = podajIloscDniWmiesiacu(2, 2004);
        System.out.println(IloscDniWmiesiacu);
    }

    public static int podajIloscDniWmiesiacu(int numerMiesiaca, int rok) {

        switch (numerMiesiaca) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (rok % 4 == 0 && rok % 100 != 0 || rok % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }
}