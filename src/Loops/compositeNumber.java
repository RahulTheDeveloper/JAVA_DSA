package Loops;

import java.util.Scanner;

public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int x=0;

        for(int i = 2; i<=n-1; i++){
            if (n % i == 0) {

                System.out.println("composite no.");
                x=1;
                 break;
            }
        }
        if(n==1) System.out.println("Neither prime or not composite");
        else if(x==0) System.out.println("Prime Number");
    }
}

