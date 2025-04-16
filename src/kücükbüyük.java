import java.util.ArrayList;
import java.util.Collection;

public class kücükbüyük {
        public static void main(String[] args) {
            // 10 adet benzersiz ve pozitif eleman içeren ArrayList oluşturulması
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(12);
            numbers.add(3);
            numbers.add(18);
            numbers.add(7);
            numbers.add(24);
            numbers.add(15);
            numbers.add(30);
            numbers.add(9);
            numbers.add(21);

            // İlk elemanı başlangıç olarak atıyoruz
            int minDiff = Integer.MAX_VALUE; // En küçük farkı tutmak için başlangıç değeri
            int firstNumber = 0;
            int secondNumber = 0;

            // Sıralı listedeki ardışık elemanların farkını hesaplayıp en küçük farkı buluyoruz
            for (int i = 0; i < numbers.size() - 1; i++) {
                int diff = numbers.get(i + 1) - numbers.get(i);
                if (diff < minDiff) {
                    minDiff = diff;
                    firstNumber = numbers.get(i);
                    secondNumber = numbers.get(i + 1);
                }
            }

            // Sonucu ekrana yazdırıyoruz
            System.out.println("Birbirine en yakın iki eleman: " + firstNumber + " ve " + secondNumber);
            System.out.println("Aralarındaki fark: " + minDiff);
        }
    }

