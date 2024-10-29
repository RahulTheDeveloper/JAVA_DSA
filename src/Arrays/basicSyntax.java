package Arrays;

import java.util.Scanner;

public class basicSyntax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of arraya:");
        int x = sc.nextInt();

        int[] arr = new int[x];

        System.out.println("Enter array Element:");
        for(int i = 0; i<x; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("printed elemnet are:");
        for(int i =0; i<x; i++){
            System.out.println(arr[i] );
        }


        }
    }

