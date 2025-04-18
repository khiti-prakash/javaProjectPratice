package com.Practic;
import java.util.Scanner;

public class LeftTriangleStarPattenDoWhileLoop {

    public static void main(String[] args)
    {
        try {
            Scanner sc = new Scanner(System.in);
            int col = sc.nextInt();
            int row =1;

            do {
                int i =1;
                while(col >= i)
                {
                    System.out.print("*");
                    i++;
                }
                col--;
                System.out.println();

            }while(col >= row);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
