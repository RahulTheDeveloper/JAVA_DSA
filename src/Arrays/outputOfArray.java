package Arrays;

import java.util.Scanner;

public class outputOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int n = sc.nextInt();
        int[] nums = new int[n];

        //input
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        //output
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    }