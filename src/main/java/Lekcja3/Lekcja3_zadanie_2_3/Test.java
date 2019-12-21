package Lekcja3.Lekcja3_zadanie_2_3;

public class Test {
    public static void main(String[] args) {
// ZADANIE 2
        // to jest obiekt klasy "Zamowienie":
        Zamowienie zamowienie_1 = new Zamowienie();
        // to sa parametry nowego obiektu, ktore nadpisuja parametry domyslne i wywoluja metody ustawiajace wartosci:
        zamowienie_1 = new Zamowienie();

        zamowienie_1.setWartoscZamowienia_Kwota(-10);
        zamowienie_1.setIloscPrzedmiotowWzamowieniu(0);
        zamowienie_1.setNumerZamowienia(1);
        zamowienie_1.setImieInazwiskoZamawiajacego("Jan Pierwszy");

// ZADANIE 3
        // to jest pierwszy obiekt klasy "KlientVIP" z wartosciami domyslnymi:
        KlientVIP klientVIP = new KlientVIP();
        klientVIP = new KlientVIP();

        // to jest drugi obiekt klasy "KlientVIP" z wartosciami dla 2och pol:
        KlientVIP klientVIP1 = new KlientVIP();
        klientVIP1 = new KlientVIP();

        klientVIP1.setImieInazwisko("VIP1: Jan Dwapola");
        klientVIP1.setLimitKredytowy(100);

        //  to jest trzeci obiekt klasy "KlientVIP" z wartosciami dla wszystkich 3och pol:
        KlientVIP klientVIP2 = new KlientVIP();
        klientVIP2 = new KlientVIP();

        klientVIP2.setImieInazwisko("VIP2: Adam Trzypola");
        klientVIP2.setLimitKredytowy(10000);
        klientVIP2.setAdresEmail("adam.trzypola@gmail.com");

        //  wypisanie wartosci pol dla kazdego z obiektow:
        System.out.println(klientVIP.getImieInazwisko());
        System.out.println(klientVIP.getLimitKredytowy());
        System.out.println(klientVIP.getAdresEmail());


        System.out.println(klientVIP1.getImieInazwisko());
        System.out.println(klientVIP1.getLimitKredytowy());
        System.out.println(klientVIP1.getAdresEmail());

        System.out.println(klientVIP2.getImieInazwisko());
        System.out.println(klientVIP2.getLimitKredytowy());
        System.out.println(klientVIP2.getAdresEmail());
    }
}