package Conditionals;
import java.util.Scanner;
public class markes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the markes:");
        int n = sc.nextInt();
        if(n>=81) System.out.println("the markes is very good");
         else if(n>=61 ) System.out.println("the markes is  good");
         else if(n>=41 ) System.out.println("the markes is Average");
        else System.out.println("the markes is Fail");



    }
}
