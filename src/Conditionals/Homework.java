package Conditionals;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if(n%5 == 0)
            System.out.println("yes, it is divisible by 5");
            else
            System.out.println("no, it is not divisible by 5");
    }
}
