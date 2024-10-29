package Arrays;

public class twoSumOfArray {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 5, 8, 1, 3};
        int x = 9;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
