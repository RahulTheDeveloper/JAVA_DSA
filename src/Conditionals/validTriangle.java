package Conditionals;

import java.util.Scanner;

public class validTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a is:");
        int a = sc.nextInt();
        System.out.println("Enter b is:");
        int b = sc.nextInt();
        System.out.println("Enter c is:");
        int c = sc.nextInt();

        System.out.println((a+b>c && b+c>a && c+a>b)? "it is a triangle": "not triangle");
    }
}
