package lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        System.out.println("Введите четырехзначное число");
        final Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        List<Integer> nums = new ArrayList<>();
        while (a != 0) {
            nums.add(a % 10);
            a /= 10;
        }

        int chislo = 0;

        for (int i = 0; i < nums.size(); i++) {
            chislo = (int) (chislo + nums.get(nums.size() - 1 - i) * Math.pow(10, i));
        }
        System.out.println("Перевернутое число: " + chislo);
    }
}
