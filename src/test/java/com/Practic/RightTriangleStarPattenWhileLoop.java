package com.Practic;
import java.util.Scanner;
public class RightTriangleStarPattenWhileLoop {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter column no");
        Integer row =1;
        Integer col =sc.nextInt();


        while(row <= col)
        {
            int i=1;
            while(i <= row)
            {
                System.out.print("*");
                i++;
            }
            row++;

            System.out.println();
        }

    }
}
