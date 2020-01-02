package Lekcja5.Lekcja5_zadania6_7;

public class Ptak implements FlyingObject {

    String nazwa;
    int rozpietoscSkrzydel;

    public Ptak(String nazwa, int rozpietoscSkrzydel) {
        this.nazwa = nazwa;
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
    }

    @Override
    public void start() {
        System.out.println("Ptak wystartowal");
    }

    public void przyspiesz() {
        System.out.println("Ptak przyspieszyl");
    }

    public void laduj() {
        System.out.println("Ptak wyladowal");
    }

    public void lecProsto() {
        System.out.println("Ptak leci prosto");
    }

    public void lecWPrawo() {
        System.out.println("Ptak leci w prawo");
    }

    public void lecWLewo() {
        System.out.println("Ptak leci w lewo");
    }

}