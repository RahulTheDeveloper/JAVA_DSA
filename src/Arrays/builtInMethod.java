package Arrays;

import java.util.Arrays;

public class builtInMethod {
    public static void main(String[] args) {
        int[] arr = {30,50,10,4,2,70};

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");


        }
    }
}
