package lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args) {
        System.out.println("Введите число в восьмеричной системе");
        final Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        List<Integer> nums = new ArrayList<>();
        while (a != 0) {
            nums.add(a % 10);
            a /= 10;
        }
        int vosm = 0;
        for (int i = 0; i < nums.size(); i++) {
            vosm = (int) (vosm + nums.get(i) * Math.pow(8, i));
        }
        System.out.println("Число в десятичной системе: " + vosm);

    }
}
