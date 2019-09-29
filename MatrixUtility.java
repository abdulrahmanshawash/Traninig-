package com.tranining.abood;
public class MatrixUtility<mat> {
    public int[][] second;
    public int[][] first;
    int [][] NumberOne= {{6,2}, {5,4}};
    int [][] NumberTwo = {{2,6}, {3,1}};

    public static int[][] multiply(int[][] first, int[][] seconed) {

        int firstARows = first.length;
        int firstAColumn = first[0].length;
        int SecBRows = seconed.length;
        int SecCol = seconed[0].length;

        if (firstAColumn != SecCol) {
            throw new IllegalArgumentException("First Row " + firstAColumn + " did not match SecondBColumns " + SecBRows + ".");
        }

        int[][] result = new int [firstARows][SecCol];

        for (int row = 0; row < firstARows; row++) { // aRow
            for (int column = 0; column < SecCol; column++) { // bColumn
                for (int current = 0; current < firstAColumn; current++) { // aColumn
                    if (result[row][column] == Integer.parseInt("null"))
                        result[row][column] = 0;
                    result[row][column] += first[row][current] * seconed[current][column];
                }
            }
        }
        return result;
    }
    static final int size = 2;
    static void scalarMultiplyProduct(int mat[][],int number)
    {

        // scalar element is multiplied by  matrix
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                mat[i][j] = number * mat[i][j];
    }

    static final int firstNum = 2;
    static final int ScenedNumb = 3;
    static void transpose(int[][] met, int[][] matrex)
    {
        int result[][] = new int[matrex[0].length][matrex.length];

        for (int i = 0; i < ScenedNumb; i++)
            for (int j = 0; j < firstNum; j++) {
                result[i][j] = matrex[j][i];
            }
    }

    static int maxNum = 50;

    // Function to print the matrix after
// ignoring first x rows and columns
    static void remove_row_col(int arr[][], int numOne, int numTwo)
    {

        // Ignore first x rows and columns
        for (int i = numTwo; i < numOne; i++)
        {
            for (int j = numTwo; j < numOne; j++)
            {
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}