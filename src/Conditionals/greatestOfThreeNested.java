package Conditionals;

import java.util.Scanner;

public class greatestOfThreeNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a is:");
        int a = sc.nextInt();
        System.out.println("Enter b is:");
        int b = sc.nextInt();
        System.out.println("Enter c is:");
        int c = sc.nextInt();

        if (a > b) {
            System.out.println(a + "  is largest");
            if (a > c) System.out.println(a + "  is largest");
            else // c>a>b
                System.out.println(c + "  is largest");
        } else { //b>a
            if (b > c) System.out.println(b + "  is largest");
            else //c>a
                System.out.println(c + "  is largest");

        }
    }
}
