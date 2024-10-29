package Arrays;

import java.util.Scanner;

public class sortArray1sand2s {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        System.out.println("Enter size of arraya:");
        int x = sc.nextInt();

        int[] arr = new int[x];

        System.out.println("Enter array Element:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = false;
        for (int i = 0; i < x; i++) {
            if (arr[i] == x) {
                flag = true;
                break;
            }

        }
        if (flag == true) System.out.println("element found");
        else System.out.println("element not fouund");


    }
    }


