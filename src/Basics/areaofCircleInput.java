package Basics;

import java.util.Scanner;

public class areaofCircleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the radius is :");
        double r = sc.nextDouble();

        double a  = 3.1415*r*r;
        System.out.println(a);
    }
}
