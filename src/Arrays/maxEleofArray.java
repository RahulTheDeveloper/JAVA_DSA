package Arrays;

import java.util.Scanner;

public class maxEleofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arraya:");
        int x = sc.nextInt();

        int[] arr = new int[x];

        System.out.println("Enter array Element:");
        for(int i = 0; i<x; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("maximun element are:");
        int max= arr[0];
        for(int i=1; i<x; i++){

            if(arr[i]>max) max=arr[i];
        }
        System.out.println(max);

    }
}
