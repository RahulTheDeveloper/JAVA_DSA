package Arrays;

public class sort0s1s {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;
        int noOfZeroes = 0;
        for (int i = 0; i < n; i++) { //count noOfZeroes
            if (arr[i] == 0) noOfZeroes++;
        }
        for (int i = 0; i < n; i++) {  // rearrange 0's or 1's
            if (i < noOfZeroes) arr[i] = 0;
            else arr[i] = 1;
        }
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
//        int i = 0;
//        int j = n - 1;
//        while (i < j) {
//            if (arr[i] == 0) i++;
//            if (arr[j] == 1) j--;
//            if (arr[i] == 1 && arr[j] == 0)
//                arr[i] = 0;
//            arr[j] = 1;
//            i++;
//            j--;
//        }
//
//        for (int ele : arr) {
//            System.out.print(ele+" ");
//        }
    }
}

