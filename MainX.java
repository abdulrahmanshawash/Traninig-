package com.tranining.abood;
import static com.tranining.abood.MatrixUtility.multiply;

public class MainX {
    public static void main(String[] args) {
        MatrixUtility matrix = new MatrixUtility();
        int[][] result = multiply(matrix.first, matrix.second);
        for (int first = 0; first< 2; first++) {
            for (int second = 0; second < 2; second++)
                System.out.print(result[first][second] + " ");
            System.out.println();
        }
    }
}
