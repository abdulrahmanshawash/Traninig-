package com.matrixes.task;

import java.util.Scanner;

class SubMatrixTest{
    public static void main(String args[]){
        //Read the input from the user using scanner
        Scanner sc = new Scanner(System.in);

        //Declare variables and matrix in array
        int n , i , j ,m;
        int [][]mat;
        System.out.println("Enter the size of the matrix :");
       n = sc.nextInt();
       System.out.println("Enter the values");
        mat = new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                mat[i][j] =sc.nextInt();
            }
        }

        System.out.println("Enter submatrix size: ");
        m = sc.nextInt();
        System.out.println("The submatrix is: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }


}