package com.matrixes.task;

import java.util.Scanner;
import static com.matrixes.task.Matrixes.matrixsize;
import static com.matrixes.task.Matrixes.multiplyscalar;

class ScalarTest {
    public static void main(String args[]) {

        //Enterd Matrix
        int scalarmatrix[][] = {{1, 8, -3},
                {4, -2, 5},};
        //Read the number multiplied by matrix that iput by the user
        Scanner num = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please Enter number multiplied by scalarmatrix");
        String number = num.nextLine();  // Read user input

        //Multiply function
        multiplyscalar(scalarmatrix, number);

        //Now to display the result of the matrix
        System.out.println("Scalar matrix multiplication result is: ");

        for (int firstm = 0; firstm < matrixsize; firstm++) {
            for (int seconedm = 0; seconedm < matrixsize; seconedm++)
                //Print the result
                System.out.println(scalarmatrix[firstm][seconedm] + " ");
            System.out.println();
        }
    }
}