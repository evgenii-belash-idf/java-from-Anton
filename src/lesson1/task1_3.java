package lesson1;

import java.util.Scanner;

public class task1_3 {
    public static void main(String[] args) {
        System.out.println("Введите число в шеснадцатиричной системе");
        final Scanner s = new Scanner(System.in);
        String text = s.nextLine().trim();
        String newText = text.substring( text.indexOf('x') + 1);

        System.out.println("Число в десятичной системе: "+ hexToDec(newText));

    }

    public static String hexToDec(String valueIn) {
        int endNum = 0;

        for (int i = 0; i < valueIn.length(); i++) {
            char curDigit = valueIn.charAt(i);
            endNum *= 16;

            if (curDigit >= 'A' && curDigit <= 'F')
                endNum += 10 + (curDigit - 'A');
            else
                endNum += curDigit - '0';
        }
        return "" + endNum;
    }
}
