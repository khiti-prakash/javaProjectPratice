package com.Practic;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class CountVowelAndConsonantsInDoWhileLoop {

    public static void main(String[] args) {
try {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a name");
    String name = sc.nextLine();
    String nameLowerCase = name.toLowerCase();
    int i = 0;
    int vowelCount = 0;
    int consonantCount = 0;
    do {
        char ch = nameLowerCase.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowelCount++;
        } else {
            consonantCount++;
        }
        i++;
    } while (i <= nameLowerCase.length() - 1);

    System.out.println(vowelCount + " vowel is present in " + name);
    System.out.printf("%d consonant is present in %s", consonantCount, name);
}
catch (IllegalStateException e)
{
    System.out.println("Please enter a name");
}
    }
}
