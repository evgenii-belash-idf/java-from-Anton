package lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1_1 {
    public static void main(String[] args) {
        System.out.println("Введите число в двоичной системе");
        final Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        List<Integer> nums = new ArrayList<>();
        while (a != 0) {
            nums.add(a % 10);
            a /= 10;
        }
        int dvoich = 0;
        for (int i = 0; i < nums.size(); i++) {

            dvoich = (int) (dvoich + nums.get(i) * Math.pow(2, i));
        }
        for (Integer num : nums) {
            if (num > 1) {
                System.out.println("Вы ввели число не в двоичной системе");
                break;
            } else {
                System.out.println("Число в десятичной системе: " + dvoich);
                break;
            }

        }

    }
}
