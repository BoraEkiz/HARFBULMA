import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class harfbulma {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<String> kelime = new ArrayList<>(4);

        kelime.add("A");
        kelime.add("D");
        kelime.add("Y");
        kelime.add("M");

        for (int i = 0; i <4; i++) {
            System.out.println("Lütfen harf giriniz");
            String deneme = scanner.nextLine();

            if (kelime.contains(deneme))
            {
                int index = kelime.indexOf(deneme);
                kelime.set(index, "found");
            }
            else
                System.out.println("Harf bulamadık listeye ekliyoruz");
                kelime.add(deneme);


        }
        System.out.println(kelime);











    }
}
