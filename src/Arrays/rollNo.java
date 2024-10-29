package Arrays;

public class rollNo {
    public static void main(String[] args) {
        int[] arr = {88, 33, 67, 15, 90, 45, 13, 23, 78, 57};
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] < 35) {

                System.out.println(arr[i] +" " + i);
            }
        }
    }
}
