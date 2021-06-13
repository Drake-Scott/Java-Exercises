package oop.assignment2.ex30;

import java.text.DecimalFormat;

public class Array {
    public static int[][] generateArray(int length){
        int[][] array;
        array = new int[length][length];
        for(int i = 1 ; i <= length; i++){

            for(int j = 1; j <= length; j++){

                array[i-1][j-1] = i*j;
            }
        }
        return array;
    }

    public static void printArray(int array[][]){

        int i, j;

        DecimalFormat one = new DecimalFormat("    0");   //depending on the amount of digits in
        DecimalFormat two = new DecimalFormat("   0");    //the next number, decide how many spaces
        DecimalFormat three = new DecimalFormat("  0");   //must come after the current num.

        for( i = 0 ; i < 12 ; i++ ){

            for( j = 0 ; j < 12 ; j++){

                if(array[i][j] < 10){
                    System.out.print(one.format(array[i][j]));
                } else
                if(array[i][j] >= 10 && array[i][j] < 100){
                    System.out.print(two.format(array[i][j]));
                } else{
                    System.out.print(three.format(array[i][j]));
                }
            }
            System.out.println();
        }
    }
}
