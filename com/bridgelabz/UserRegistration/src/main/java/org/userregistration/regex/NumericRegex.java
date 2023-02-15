package org.userregistration.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public  class NumericRegex {
    public static class RegexRunner {


        static boolean validate(String regex, String input) {

            return Pattern.compile(regex).matcher(input).matches();

        }
    }

    public static void main(String[] args) {
        String numericRegex = "^[1,2,3]{1}[0-9]{9}$";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        String  num= scanner.next();
        if(RegexRunner.validate(numericRegex,num)){
            System.out.println("Entered valid number");
        }else System.out.println(" Invalid Number, Please Enter a Valid One");
    }
}
