package Basics;

import java.util.Scanner;

public class sumOfTwoNumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x is :");
        int x = sc.nextInt();
        System.out.println("Enter y is :");
        int y = sc.nextInt();
        System.out.println("The value of x and y is  "+(x+y));
    }
}
