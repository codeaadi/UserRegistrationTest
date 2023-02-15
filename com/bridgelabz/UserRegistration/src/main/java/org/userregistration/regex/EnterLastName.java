package org.userregistration.regex;
import java.util.Scanner;
import java.util.regex.Pattern;

public  class EnterLastName {
    public static class RegexRunner {


        static boolean validate(String regex, String input) {

            return Pattern.compile(regex).matcher(input).matches();

        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String lastName = scan.next();
            String lastRegex = "^[A-Z]{1}[a-z]{2,}";
            System.out.println(validate(lastRegex,lastName));
        }
    }
}