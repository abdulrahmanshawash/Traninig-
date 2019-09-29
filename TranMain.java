package com.tranining.abood;

import static com.tranining.abood.MatrixUtility.*;

public class TranMain {

    public static void main (String[] args)
    {
        int met[][] = { {1, 2 , 3},
                {0,-6,7},
        };

        int b[][] = new int[firstNum][ScenedNumb], i, j;

        transpose(met,b);

        System.out.print("Result matrix is \n");
        for (i = 0; i < firstNum; i++)
        {
            for (j = 0; j < ScenedNumb; j++)
                System.out.print(b[i][j] + " ");
            System.out.print("\n");
        }
    }
}