package Conditionals;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a cost price:");
        int cp = sc.nextInt();
        System.out.println("Enter a selling price:");
        int sp = sc.nextInt();

        if(sp>cp)
            System.out.println("profit "+(sp-cp));
        if(cp>sp)
            System.out.println("loss "+(cp-sp));
        if(sp == cp)
            System.out.println("no profit no loss");
        }

    }

