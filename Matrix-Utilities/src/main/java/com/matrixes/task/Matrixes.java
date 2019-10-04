package com.matrixes.task;

public class Matrixes
{
    //Declare two variable each one to the matrix
public int [][]firstmatrix;
public int [][]seconedmatrix;

   //Create matrix multiplication method ro multiply first matrix with the seconed matrix
public static int [][] multiply (int [][] firstmatrix , int [][]seconedmatrix){

    //Declare varibles to column and row to the first matrix
int firstmatrixrow = firstmatrix.length;
int firstmatrixcolumn = firstmatrix[0].length;

    //Declare varibles to column and row to the first matrix
int seconedmatrixrow = seconedmatrix.length;
int seconedmatrixcolumn = seconedmatrix[0].length;

    //Check the first matrix column opreates seconed matrix column
if (firstmatrixcolumn != seconedmatrixcolumn){
    System.out.println("First matrix column"+firstmatrixcolumn+"does not match seconed colum row"+seconedmatrixcolumn);
    }

    //create new array that store the result
int [][]result = new int[firstmatrixrow][seconedmatrixcolumn];
    int currentmatrix;
    for (int row = 0; row < firstmatrixrow;row++){
            for (int column = 0;column < seconedmatrixcolumn;column++){
                for(currentmatrix = 0;currentmatrix<firstmatrixrow;currentmatrix++)
                    if (result[row][column] == 0);
                result[row][column] += firstmatrix[row][currentmatrix] * seconedmatrix[currentmatrix][column];
            }
        }
        return result;
}
    //-----------------------------------------------------------------------------------------------

    //To input any size of the matrix of the scalar product
static final int matrixsize = 2;
    // create a method thats gives a function to the scalar multiplication
    static void multiplyscalar(int [][]scalarmatrix , String numbermultiply){

        for (int i = 0;i<matrixsize;i++)
            for(int j = 0;j<matrixsize;j++)
                //The function of the scalar multiplication
                scalarmatrix[i][j] = scalarmatrix[i][j];
    }

    //-----------------------------------------------------------------------------------------------

    //Declare the Transportation matrix number of the rows and column
    static final int transmatrixrow = 2;
    static final int transmatrixcolumn = 3;

    //Create a method thats contain the function of the matrix transportation

    // This function stores Transport of A[][] in B[][]
    static void transpose(int trmone[][], int tremtwo[][])
    {
        for (int i = 0; i < transmatrixrow; i++)
            for (int j = 0; j < transmatrixcolumn; j++)
               tremtwo [i][j] = trmone[j][i];
    }


}
