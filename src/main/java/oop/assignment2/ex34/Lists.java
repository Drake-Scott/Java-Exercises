package oop.assignment2.ex34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Drake Scott
 */


public class Lists {

    public static List listStuff(){
        String[] employeeArr = new String[]{"John Smith", "Jackie Jackson", "Chris Jones",
                "Amanda Cullen", "Jeremy Goodwin"};

        List<String> employees = new ArrayList<String>(Arrays.asList(employeeArr));
        return employees;
    }

    public static void printList(List myList){
        Iterator itr = myList.iterator();
        System.out.println("There are " + myList.size() + " employees:");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static List removeMember(List employees, String name){
        while (employees.contains(name)){
            employees.remove(name);
        }
        return employees;
    }
}
