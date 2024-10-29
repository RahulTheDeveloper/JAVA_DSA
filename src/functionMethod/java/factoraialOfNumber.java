package functionMethod.java;

import java.util.Scanner;

public class factoraialOfNumber {
    public static void mount(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;

        }
        System.out.println("the answer: " + f);
    }


    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n:");
            int n = sc.nextInt();
            mount(n);
        }

    }

