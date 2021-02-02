package lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        final Scanner s = new Scanner(System.in);
        int chislo = s.nextInt();

        List<Integer> nums = new ArrayList<>();
        while (chislo != 0) {
            nums.add(chislo % 10);
            chislo /= 10;
        }

        if (nums.size() == 3){
            System.out.println("Число является 3-значным");
        }else System.out.println("Число является " + nums.size() + "-значным");

        if (nums.get(0) == 7){
            System.out.println("В числе последняя цифра 7");
        }

        if (nums.get(0) % 2 == 0){
            System.out.println("Число четное");
        }else System.out.println("Число нечетное");

    }
}
