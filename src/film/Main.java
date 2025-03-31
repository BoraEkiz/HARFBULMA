package film;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        film film1 = new film("Inception", 2010, "Bilim Kurgu", 8.8);
        film film2 = new film("The Dark Knight", 2008, "Aksiyon", 9.0);
        film film3 = new film("Interstellar", 2014, "Bilim Kurgu", 8.6);
        film film4 = new film("Forrest Gump", 1994, "Dram", 8.8);
        film film5 = new film("The Matrix", 1999, "Bilim Kurgu", 8.7);


        // Film koleksiyonu (liste)
            List<film> filmler = new ArrayList<>();
        filmler.add(film1);
        filmler.add(film2);
        filmler.add(film3);
        filmler.add(film4);
        filmler.add(film5);


        System.out.println("IMDb Puanına göre (Büyükten Küçüğe) sıralama:");
        filmler.sort(film.imdbComparator);
        for (film film : filmler) {
            System.out.println(film);
        }

        // Yayın yılına göre küçükten büyüğe sıralama
        System.out.println("\nYayın Yılına göre (Küçükten Büyüğe) sıralama:");
        filmler.sort(film.yayinYiliComparator);
        for (film film : filmler) {
            System.out.println(film);
        }

    }

}
