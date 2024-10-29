package functionMethod.java;




public class swap{
    public static void swapexample(int a,int b) {
        int temp = a;
        a = b;
        b = temp;



    }


    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swapexample(a,b);
        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }
}
