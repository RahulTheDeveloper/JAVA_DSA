package Conditionals;

import java.util.Scanner;

public class maximumofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a is:");
        int a = sc.nextInt();
        System.out.println("Enter b is:");
        int b = sc.nextInt();
        System.out.println("Enter c is:");
        int c = sc.nextInt();

        if(a>b && a>c) System.out.println(a+"  a is largest");
        if(b>a && b>c) System.out.println(b+"  b is largest");
        if(c>a && c>b) System.out.println(c+" c is largest");
    }
}
