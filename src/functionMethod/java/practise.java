package functionMethod.java;

import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no:");
        int a = sc.nextInt();

        System.out.println("Enter second no:");
        int b = sc.nextInt();

        System.out.println("Enter third no:");
        int c = sc.nextInt();

        System.out.println("The average is:");
//        Avg(a,b,c);
int avg = Avg(a,b,c);
        System.out.println(avg);

    }

    public static int Avg(int a, int b, int c) {
//        int avg = (a+b+c)/3;
//        System.out.println(avg);
        return (a+b+c)/3;
    }

}