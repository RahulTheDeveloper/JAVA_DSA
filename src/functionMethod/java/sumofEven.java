package functionMethod.java;

import java.util.Scanner;

public class sumofEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a:");
        int a = sc.nextInt();
        int sum =  SumofevenNumber(a);
        System.out.println("the sum of 1 to "+ a+ " is "+sum);

    }

    public static int SumofevenNumber(int a) {
        int sum =0;
        for (int i = 1; i <= a; i++) {
            if(i%2==0){
               sum = sum+i;
            }

        }
        return sum;
    }

}
