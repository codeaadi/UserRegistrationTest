package org.userregistration.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User Need to Enter Valid Email
 */

public class EnterEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = "abc.xyz@bl.co.in";
        System.out.println("Email : " + email);
        System.out.println(Pattern.matches("^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$", email));
    }
}
