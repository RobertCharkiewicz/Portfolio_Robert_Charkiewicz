package Lekcja5.Lekcja5_zadania6_7;

public class Latawiec<L> implements FlyingObject {

    String kolor;
    boolean maSznurek;

    public Latawiec(String kolor, boolean maSznurek) {
        this.kolor = kolor;
        this.maSznurek = maSznurek;
    }

    @Override
    public void start() {
        System.out.println("Latawiec wystartowal");
    }

    public void przyspiesz() {
        System.out.println("Latawiec przyspieszyl");
    }

    public void laduj() {
        System.out.println("Latawiec wyladowal");
    }

    public void lecProsto() {
        System.out.println("Latawiec leci prosto");
    }

    public void lecWPrawo() {
        System.out.println("Latawiec leci w prawo");
    }

    public void lecWLewo() {
        System.out.println("Latawiec leci w lewo");
    }

}