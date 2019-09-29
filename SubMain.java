package com.tranining.abood;

import static com.tranining.abood.MatrixUtility.remove_row_col;

public class SubMain {
    public static void main (String[] args)
    {
        // Order of the square matrix
        int n = 3;
        int arr[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        int x = 1;
        remove_row_col(arr, n, x);
    }
}
}
