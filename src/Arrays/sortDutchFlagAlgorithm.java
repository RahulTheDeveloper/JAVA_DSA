package Arrays;

import javax.swing.*;

public class sortDutchFlagAlgorithm {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 1, 0, 0};
        int n = arr.length;

        int mid = 0;
        int low = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) mid++;
            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;

            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
