package com.matrixes.task;

import static com.matrixes.task.Matrixes.*;

class TransportationTest{
    public static void main(String args[]){

        //Declare a variable that have a matrix to transpose
        int transm[][] = { { 1 , 2 , 3},
                           { 0, -6 ,7 }};
        int fm = 0;
        int sm = 0;
        int m[][] = new int[fm][sm], i, j;

        transpose(transm, m);

        //print result of matrix
        System.out.print("Result matrix is \n");

        for(i=0;i<transmatrixrow;i++){
            for (j=0;j<transmatrixcolumn;j++)
                System.out.print(m[i][j] + " ");

            System.out.print("\n");
        }
    }
}