package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        String strNum = String.valueOf(Math.abs(number));
        String reversedStr = "";
        for (int i = 0; i < strNum.length(); i++) {
            reversedStr = strNum.charAt(i) + reversedStr;
        }
        if(Math.abs(number) == Integer.parseInt(reversedStr)) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean isPerfectNumber(int number) {
        boolean isPerfect = false;
        if(number < 0) {
            return false;
        }

        int sum = 0;
        for (int i=1;i<=number/2;i++) {
            if(number%i == 0) {
                sum += i;
            }
        }

        if(sum == number) {
            isPerfect = true;
        };
        return isPerfect;
    }

    public static String numberToWords(int number) {
        if(number < 0) {
            return "Invalid Value";
        }

        String[] strArr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String strNum = String.valueOf(number);
        String returnVal = strArr[Integer.parseInt(String.valueOf(strNum.charAt(0)))];
        for(int i=1;i<strNum.length();i++) {
            int index = Integer.parseInt(String.valueOf(strNum.charAt(i)));
            returnVal = returnVal + " " + strArr[index];
        }
        return returnVal;
    }
}
