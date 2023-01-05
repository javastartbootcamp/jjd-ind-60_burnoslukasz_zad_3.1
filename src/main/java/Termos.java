public class Termos {
    String producent;
    String kolor;
    int pojemnosc;

    Termos(String prod, String kol, int poj) {
        producent = prod;
        kolor = kol;
        pojemnosc = poj;
    }

    void informacje() {
        System.out.println("Termos: " + producent + " " + kolor + " " + pojemnosc + "ml");
    }
}
