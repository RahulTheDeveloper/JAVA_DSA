package Loops;

public class oddNumberprint {
    public static void main(String[] args) {
//        for(int i = 1; i<=100; i+=2){
//            System.out.print(i+ " ");
//        }

//        continue
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
