package frekansbulma;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen kelime giriniz...");
        String kelime = scanner.nextLine();

        kelime = kelime.toLowerCase(Locale.ROOT);


        Map<Character,Integer> frekans = new HashMap<>();

        for (int i = 0; i < kelime.length(); i++) {
            char c = kelime.charAt(i);
            if (Character.isLetter(c)) {
                if (frekans.containsKey(c)) {
                    frekans.put(c, frekans.get(c) + 1);
                } else {
                    frekans.put(c, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : frekans.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();



    }
}
