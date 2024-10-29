package functionMethod.java;

import java.util.Scanner;

public class sumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int a = sc.nextInt();

        System.out.println("Enter num:");
        int b = sc.nextInt();

        int sum = sumOfTwo(a,b);
        System.out.println(sum);

    }

    public static int sumOfTwo(int a, int b) {
        return a + b;
    }

}


