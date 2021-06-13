package oop.assignment2.ex27;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */

public class ex27 {

    private static final Scanner input = new Scanner(System.in);
    private static String fname, lname, zip, id;

    public static void main(String[] args) {

        readUserInput();

        validateInput();

    }

    private static void readUserInput(){
        System.out.print("Enter the first name: ");
        fname = input.nextLine();

        System.out.print("Enter the last name: ");
        lname = input.nextLine();

        System.out.print("Enter the ZIP code: ");
        zip= input.next();

        System.out.print("Enter the employee ID: ");
        id = input.next();
    }

    private static void validateInput(){
        Validator v = new Validator();
        int validCount = 0;
        String fnameOutput, lnameOutput, zipOutput, idOutput;

        if(!v.validateName(fname)){
            fnameOutput = "The first name must be at least 2 characters long.";
        } else {
            fnameOutput = "";
            validCount++;
        }

        if(!v.validateName(lname)){
            lnameOutput = "The last name must be at least 2 characters long.";
        } else {
            lnameOutput = "";
            validCount++;
        }

        if(!v.validateZIP(zip)){
            zipOutput = "The zipcode must be a 5 digit number.";
        } else {
            zipOutput = "";
            validCount++;
        }

        if(!v.validateID(id)){
            idOutput = "The employee ID must be in the format of AA-1234.";
        } else {
            idOutput = "";
            validCount++;
        }
    displayValidations(validCount, fnameOutput, lnameOutput, zipOutput, idOutput);
    }

    private static void displayValidations(int n, String fo, String lo, String zo, String ido){
        String finalOutput;
        if(n == 4){
            finalOutput = "There were no errors found.";
        } else {
            finalOutput = fo + "\n" + lo + "\n" + zo + "\n" + ido;
        }
        System.out.println(finalOutput);
    }

}
