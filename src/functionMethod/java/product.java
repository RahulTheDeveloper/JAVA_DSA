package functionMethod.java;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();
        if(isEven(num)){
            System.out.println("Even hain");
        }else{
            System.out.println("odd hain");
        }

    }

    public static boolean isEven(int n) {
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
}
