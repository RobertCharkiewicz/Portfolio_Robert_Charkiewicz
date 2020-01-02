package Lekcja3.Lekcja3_zadanie_2_3;

public class KlientVIP {

    private String imieInazwisko;
    private int limitKredytowy;
    private String adresEmail;

    // to jest konstruktor domyslny bez parametrow, ktory ustawia wartosci domyslne dla pol wszystkich obiektow:
    public KlientVIP() {
        imieInazwisko = "VIP: domyslne imie i nazwisko";
        limitKredytowy = 0;
        adresEmail = "domyslny adres email";
    }
    // to jest konstruktor przyjmujacy parametry dla 2 pol oraz wartosc domyslna dla 3go pola:
    public void KlientVIP1(String imieInazwisko, int limitKredytowy, String adresEmail) {
        this.imieInazwisko = imieInazwisko;
        this.limitKredytowy = limitKredytowy;
    }
    // to jest konstruktor przyjmujacy parametry dla wszystkich 3 pol:
    public void KlientVIP2(String imieInazwisko, int limitKredytowy, String adresEmail) {
        this.imieInazwisko = imieInazwisko;
        this.limitKredytowy = limitKredytowy;
        this.adresEmail = adresEmail;
    }
    // to sa gettery dla wszystkich pol:
    public String getImieInazwisko() {
        return imieInazwisko;
    }
    public int getLimitKredytowy() {
        return limitKredytowy;
    }
    public String getAdresEmail() {
        return adresEmail;
    }
    // to sa setery do wszystkich pol:
    public void setImieInazwisko(String imieInazwisko) {
        this.imieInazwisko = imieInazwisko;
    }
    public void setLimitKredytowy(int limitKredytowy) {
        this.limitKredytowy = limitKredytowy;
    }
    public void setAdresEmail(String adresEmail) {
        this.adresEmail = adresEmail;
    }
}