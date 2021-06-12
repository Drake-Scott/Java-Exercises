package oop.assignment2.ex24;

import java.util.Scanner;

public class ex24 {
    private static final Scanner input = new Scanner(System.in);
    public static String s1, s2;

    public static void main(String[] args) {

        readUserInput();

        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(s1, s2);

        System.out.println(generateOutput(result));
    }

    public static void readUserInput(){     //method to prompt and read user input.
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        s1 = input.next();
        System.out.print("Enter the second string: ");
        s2 = input.next();
    }

    public static String generateOutput(boolean result){
        String conditional;
        if(result) {
            conditional = "";
        }
        else {
            conditional = "not ";
        }
        String output = "\"" + s1 + "\" and \"" + s2 + "\" are " + conditional + "anagrams.";
        return output;
    }
}
