package Arrays;

import java.util.ArrayList;

public class arrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(6);
        System.out.println(arr+" "+arr.size());
        arr.add(5);
        System.out.println(arr+" "+arr.size());
        arr.add(3);
        System.out.println(arr+" "+arr.size());

        arr.remove(2);
        System.out.println(arr+" "+arr.size());
    }
}
