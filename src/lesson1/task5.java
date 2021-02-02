package lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task5 {
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

        for (int i = 1; i < nums.size(); i++) {
            for (Integer num : nums) {
                if (nums.get(i).equals(num)) {
                    chislo++;
                }
            }
        }

        if (chislo > 3){
            System.out.println("В числе есть повторения");
        }else {
            System.out.println("В числе все цифры различны");
        }
    }
}
