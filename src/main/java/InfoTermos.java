public class InfoTermos {
    public static void main(String[] args) {
        Termos termos1 = new Termos();
        termos1.producent = "HiMountain";
        termos1.kolor = "Czarny";
        termos1.pojemnosc = 400;

        System.out.println("Termos: " + termos1.producent + " " + termos1.kolor + " " + termos1.pojemnosc + "ml");

        Termos termos2 = new Termos();
        termos2.producent = "Mammut";
        termos2.kolor = "Szary";
        termos2.pojemnosc = 500;

        System.out.println("Termos: " + termos2.producent + " " + termos2.kolor + " " + termos2.pojemnosc + "ml");
    }
}
