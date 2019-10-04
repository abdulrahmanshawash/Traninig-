package com.matrixes.task;

import java.util.Scanner;

public class ArraySumTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declare the matrixes with size
        int firstmatrix [] = new int[6];
        int seconedmatrix[] = new int[6];
        int matrixresult[] = new int[6];

        //Enter the first element matrixes
        System.out.println("Enter the elements of the first array");
        for(int x=0;x<6;x++)
        {
            System.out.println("Enter the element");
            firstmatrix[x]=input.nextInt();
        }

        //Enter the seconed element matrixes
        System.out.println("Enter the elements of the seconed array");
        for(int y=0;y<6;y++)
        {
            System.out.println("Enter the element");
            seconedmatrix[y]=input.nextInt();
        }

        for(int z=0;z<6;z++)
        {
            System.out.println("Enter the element");
            matrixresult[z]=firstmatrix[z]+seconedmatrix[z];
        }
        //print the result
        System.out.println("The Sum of two array is : ");
        for(int result :matrixresult)
        {
            System.out.println(result);
        }
    }
}
