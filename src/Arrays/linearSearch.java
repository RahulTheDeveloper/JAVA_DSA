package Arrays;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the target value:");
//        int x = sc.nextInt();

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elementes:");
        for(int i=1; i<n; i++){
            arr[i] = sc.nextInt();
        }
    }
}
