package com.matrixes.task;

import static com.matrixes.task.Matrixes.multiply;

//This java file is to Test matrix multiplication
class MatrixMultplicationTest {
    public static void main(String args[]){
        //create an new object of the matrixes class
        Matrixes matrixX = new Matrixes();

        //Declare result variable that stores result of the multiplying the first with the seconed matrix
        int [][] result = multiply(matrixX.firstmatrix , matrixX.seconedmatrix);
                for(int firstm = 0; firstm<2; firstm++){
                    for(int seconedm = 0; seconedm<2;seconedm++ )
                        //print the result after for loop
                        System.out.println(result[firstm][seconedm]);
                      System.out.println();
        }
    }
}
