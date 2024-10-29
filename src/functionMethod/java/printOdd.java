package functionMethod.java;

import java.util.Scanner;

public class printOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        printOddNumberBetween(a,b);

    }

    public static void printOddNumberBetween(int a ,int b ){
        for(int i=a; i<=b; i++){
            if(i%2!=0){
                System.out.println(i+" odd");
            }
        }

    }
}
