package recordodev;

public class OgrenciExample {

    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("Bora", "Ekiz",422);
        Ogrenci ogrenci2 = new Ogrenci("Bora", "Ekiz",422);
        Ogrenci ogrenci3 = new Ogrenci("Bora", "Ekiz",422);
        Ogrenci ogrenci4 = new Ogrenci("Bora", "Ekiz",422);
        Ogrenci ogrenci5 = new Ogrenci("Bora", "Ekiz",422);

        System.out.println(ogrenci1);
        System.out.println(ogrenci3);

        System.out.println("Kontrol: " + ogrenci1 .equals(ogrenci3));
        System.out.println("Kontrol2: " + (ogrenci1.hashCode() == ogrenci3.hashCode()));

    }
}
