package Lekcja4_zadanie2;

public class Customer {
    private String name;
    private String surname;
    private int clientID;

    Customer(String name, String surname, int clientID) {
        this.name = name;
        this.surname = surname;
        this.clientID = clientID;

    }

//  to jest metoda do weryfikacji ilosci przyjmowanych znakow polu tekstowym:
    public boolean verifyNameLength(String name) {
        if (name.length() <= 30) {
            return true;
        }
//      else return false; - tak tez moze byc, wtedy bez "return false;"
        return false;
    }


    public boolean verifySurnameLength(String surname) {
        if (name.length() <= 30) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

// to jest przerobiony setter sluzacy do weryfikacji ilosci przyjmowanych znakow w polu tekstowym:
    public void setName(String name) {
//        this.name = name; - to wywalamy z pierwotnie zgenerowanego settera
        if (verifyNameLength(name)) {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {

        if (verifySurnameLength(surname)) {
            this.surname = surname;
        }
    }

    public int getClientID() {
        return clientID;
    }

}