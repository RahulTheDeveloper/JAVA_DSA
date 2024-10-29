package Arrays;

import java.util.Scanner;
import java.util.ArrayList;
public class basicOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(2);
        nums.add(0,1);
        nums.add(1,2);
        nums.add(2,3);
//        System.out.println(nums);

        for(int i = 0; i<nums.size(); i++){
            System.out.println(nums.get(i)+" ");
        }
        nums.set(1,8);
        System.out.println(nums);

        nums.add(7);
        System.out.println(nums);

    }
    }

