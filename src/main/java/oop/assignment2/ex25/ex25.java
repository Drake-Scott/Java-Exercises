package oop.assignment2.ex25;

import oop.assignment2.ex24.AnagramDetector;

import java.util.Scanner;

public class ex25 {

    private static final Scanner input = new Scanner(System.in);
    private static String password;

    public static void main(String[] args) {
        readUserInput();

        PasswordCheck pc = new PasswordCheck();
        int result = pc.passwordValidator(password);

        String strength = interpretStrength(result);

        System.out.println(generateOutput(strength));
    }

    public static void readUserInput(){
        System.out.print("Enter your password: ");
        password = input.next();
    }

    public static String interpretStrength(int result){
        String strength = "very weak";
        //0 = very weak, 1 = weak, 2 = avg, 3 = above average, 4 = strong, 5 = very strong.
        if (result == 0){
            return strength;
        } else
        if (result == 1){
            strength = " weak";
        } else
        if (result == 2){
            strength = "n average";
        } else
        if (result == 3) {
            strength = "n above average";
        } else
        if (result == 4) {
            strength = " strong";
        } else{
            strength = " very strong";
        }
        return strength;
    }

    public static String generateOutput(String strength){
        String output = "The password '" + password + "' is a" + strength + " password.";
        return output;
    }

}


