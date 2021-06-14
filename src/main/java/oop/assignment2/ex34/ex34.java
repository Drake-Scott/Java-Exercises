package oop.assignment2.ex34;

import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */


public class ex34 {
    public static Scanner input = new Scanner(System.in);
    public static Lists l = new Lists();

    public static void main(String[] args) {

        List employees = l.listStuff();
        l.printList(employees);

        String name = readUserInput();
        System.out.println();

        List newEmployees = l.removeMember(employees, name);
        l.printList(newEmployees);


    }

    public static String readUserInput(){
        System.out.print("\nEnter an employee name to remove: ");
        String name = input.nextLine();
        return name;
    }


}
