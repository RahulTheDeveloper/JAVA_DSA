package Arrays;

public class secLargestElemofArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 7, 8, 5, 915, 23};

        int max = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max)
                max = arr[i];
        }
int smx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != max)
                smx = Math.max(smx,arr[i]);
        }
        System.out.println(max);
        System.out.println(smx);
        }

}


