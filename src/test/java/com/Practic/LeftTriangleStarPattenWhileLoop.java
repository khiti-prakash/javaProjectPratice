package com.Practic;

public class LeftTriangleStarPattenWhileLoop {

    public static void main(String[] args){

        Integer col = 5;
        Integer row = 1;

        while(col >= row)
        {
            int i =1;
            while(col >= i) {
                System.out.print("*");
                i++;
            }

            col--;
            System.out.println();

        }

    }
}
