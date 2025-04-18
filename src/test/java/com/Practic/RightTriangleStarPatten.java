package com.Practic;

public class RightTriangleStarPatten {

    public static void main(String[] args)
    { int row=0;
        int col =5;
        for (int i =row; i<= col; i++)
        {
            for (int j =0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
