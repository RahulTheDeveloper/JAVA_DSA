package Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
int n = arr.length;
        for( int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int i=1; i<n; i++){

            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
            }
        for( int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
