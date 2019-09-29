package com.tranining.abood;
import static com.tranining.abood.MatrixUtility.scalarMultiplyProduct;
import static com.tranining.abood.MatrixUtility.size;

public class SCMain {
    public static void main(String[] args) {
        int mat[][] = {{1, 8, -3},
                {4, -2, 5},};
        int number = 2;

        scalarMultiplyProduct(mat, number);

        // to display the result matrix
        System.out.println("Scalar Product Matrix is : ");

        for (int one = 0; one < size; one++) {
            for (int two = 0; two < size; two++)
                System.out.print(mat[one][two] + " ");
            System.out.println();
        }
    }
}
