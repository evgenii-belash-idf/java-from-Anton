package lesson1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Введите количество секунд");
        final Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int min = a/60;
        int sec = a % 60;
        System.out.println(a + " сек. = " + min + " мин. и " + sec + " сек.");

        int hour = min / 60;
        min = min % 60;
        System.out.println(a + " сек. = " + hour + " ч. " + min + " мин. и " + sec + " сек.");

        int day = hour / 24;
        hour = hour % 24;
        System.out.println(a + " сек. =  " + day + " д. " + hour + " ч. " + min + " мин. и " + sec + " сек.");

        int ned = day / 7;
        day = day % 7;
        System.out.println(a + " сек. =  " + ned + " н. " + day + " д. " + hour + " ч. " + min + " мин. и " + sec + " сек.");
    }
}
