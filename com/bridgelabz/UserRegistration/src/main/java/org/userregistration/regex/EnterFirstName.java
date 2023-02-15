package org.userregistration.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EnterFirstName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Name: ");
        String firstName = scan.next();
        if(Pattern.matches("^[A-Z]{1}[A-Z-a-z]{2,}$",firstName)){
            System.out.println("FirstName: "+ firstName);
        }else System.out.println("Enter A Valid First Name.");;
    }

}
