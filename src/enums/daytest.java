package enums;

import java.util.Scanner;

public class daytest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir gün adı giriniz (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY): ");
        String inputDay = scanner.nextLine().trim().toUpperCase();


        try {

            Day day = Day.valueOf(inputDay);
            System.out.println(inputDay + " günü çalışma saatleri: " + day.getWorkHours());
        } catch (IllegalArgumentException e) {
            System.out.println("Lütfen tekrar deneyiniz.");
        } finally {
            scanner.close();
        }
    }

}
