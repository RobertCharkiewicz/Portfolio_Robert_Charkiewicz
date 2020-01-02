package Lekcja3.Lekcja3_zadanie_2_3;

public class Zamowienie {
    private int wartoscZamowienia_Kwota;
    private int iloscPrzedmiotowWzamowieniu;
    private int numerZamowienia;
    private String imieInazwiskoZamawiajacego;
    //to jest domyslny konstruktor klasy,bez parametrow, zawierajacy stale jakie beda nadane wszystkim moim obiektom:
    public Zamowienie() {
        wartoscZamowienia_Kwota = 0;
        iloscPrzedmiotowWzamowieniu = 0;
        numerZamowienia = 0;
        imieInazwiskoZamawiajacego = "Ktos Domyslny";
    }
    //to jest pelny konstruktor klasy (metoda z parametrami);
    public Zamowienie(int wartoscZamowienia_Kwota, int iloscPrzedmiotowWzamowieniu, int numerZamowienia,
                      String imieInazwiskoZamawiajacego) {

        this.wartoscZamowienia_Kwota = wartoscZamowienia_Kwota;
        this.iloscPrzedmiotowWzamowieniu = iloscPrzedmiotowWzamowieniu;
        this.numerZamowienia = numerZamowienia;
        this.imieInazwiskoZamawiajacego = imieInazwiskoZamawiajacego;
    }
    // to sa metody ustawiajace wartosci parametrow (sa wywolywane w klasie "Test"):
    public void setWartoscZamowienia_Kwota(int wartoscZamowienia_Kwota) {
        if (wartoscZamowienia_Kwota >= 0)
            this.wartoscZamowienia_Kwota = wartoscZamowienia_Kwota;
        else {
            System.out.println("Kwota zamowienia moze byc tylko dodatnia");
        }
    }
    public void setIloscPrzedmiotowWzamowieniu(int iloscPrzedmiotowWzamowieniu) {
        if (iloscPrzedmiotowWzamowieniu >= 1)
            this.iloscPrzedmiotowWzamowieniu = iloscPrzedmiotowWzamowieniu;
        else {
            System.out.println("Ilosc przedmiotow w zamowieniu nie moze byc mniejsza niz 1");
        }
    }
    public void setNumerZamowienia(int numerZamowienia) {
        this.numerZamowienia = numerZamowienia;
    }
    public void setImieInazwiskoZamawiajacego(String imieInazwiskoZamawiajacego) {
        this.imieInazwiskoZamawiajacego = imieInazwiskoZamawiajacego;
    }
}
