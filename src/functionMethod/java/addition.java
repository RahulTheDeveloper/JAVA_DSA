package functionMethod.java;

public class addition {
    public static void sum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static float sum(int a , int b, int c){
        return a+b+c;

    }

    public static void main(String[] args) {
        sum(2,3);
        System.out.println(sum(1,1,1));
    }
}
