package film;

import java.util.Comparator;
import java.util.List;

public class film {


    private String filmadi;
    private int yayinyili;
    private String Filmtürü;
    private  double imdb;

    public film(String filmadi, int yayinyili, String filmtürü, double imdb) {
        this.filmadi = filmadi;
        this.yayinyili = yayinyili;
        Filmtürü = filmtürü;
        this.imdb = imdb;
    }

    public String getFilmadi() {
        return filmadi;
    }

    public int getYayinyili() {
        return yayinyili;
    }

    public String getFilmtürü() {
        return Filmtürü;
    }

    public double getImdb() {
        return imdb;
    }

    @Override
    public String toString() {
        return "film{" +
                "filmadi='" + filmadi + '\'' +
                ", yayinyili=" + yayinyili +
                ", Filmtürü='" + Filmtürü + '\'' +
                ", imdb=" + imdb +
                '}';
    }


    public static Comparator<film> imdbComparator = new Comparator<film>() {
        @Override
        public int compare(film f1, film f2) {
            return Double.compare(f2.getImdb(), f1.getImdb()); // Büyükten küçüğe sıralama
        }
    };

    // Yayın yılına göre karşılaştırma (küçükten büyüğe sıralama için)
    public static Comparator<film> yayinYiliComparator = new Comparator<film>() {
        @Override
        public int compare(film f1, film f2) {
            return Integer.compare(f1.getYayinyili(), f2.getYayinyili()); // Küçükten büyüğe sıralama
        }
    };
}


