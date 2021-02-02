package lesson1;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        System.out.println("Введите число a");
        final Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Введите число b");
        int b = s.nextInt();
        System.out.println("Введите радиус r");
        int r = s.nextInt();

        double c = Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2));

        if ( c <= ((double) r*2)){
            System.out.println("Кругом с радиусом " + r + " можно полностью закрыть прямоугольник " + a + "x" + b);
        }else  System.out.println("Кругом с радиусом " + r + " нельзя полностью закрыть прямоугольник " + a + "x" + b);

    }
}
