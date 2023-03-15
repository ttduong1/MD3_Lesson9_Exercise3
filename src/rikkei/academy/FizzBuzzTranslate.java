package rikkei.academy;

import java.util.Scanner;

public class FizzBuzzTranslate {
    public static String translate(int number) {
        if (number < 1 || number > 100){
            throw new IllegalArgumentException("Number must be between 1 and 100");
        }
        String result = "";
        if (number % 3 == 0) {
            result = "Fizz";
        }
        if (number % 5 == 0) {
            result = "Buzz";
        }
        if (number % 3 == 0 && number % 5 == 0){
            result = "FizzBuzz";
        }
        if (result.isEmpty()){
            result = Integer.toString(number);
        }
        return result;
    }
    public static String translateUp(int num) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int number = scanner.nextInt();
        String output = "";

        if (number % 3 == 0) {
            output += "Fizz";
        }
        if (number % 5 == 0) {
            output += "Buzz";
        }
        if (String.valueOf(number).contains("3")) {
            output = "Fizz";
        }
        if (String.valueOf(number).contains("5")) {
            output = "Buzz";
        }
        if (output.isEmpty()) {
            output = toWords(number);
        }

        System.out.println(output);
        return "";
    }

    private static String toWords(int number) {
        String[] ones = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] tens = {"mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
        if (number == 0) {
            return ones[0];
        }
        if (number < 10) {
            return ones[number];
        }
        if (number < 20) {
            return tens[0] + " " + ones[number % 10];
        }
        if (number < 100) {
            return tens[number / 10 - 1] + " " + ones[number % 10];
        }
        return "";
    }
}

