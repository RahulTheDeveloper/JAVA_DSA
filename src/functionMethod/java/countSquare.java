package functionMethod.java;

public class countSquare {
    public static void main(String[] args) {
        int num=12345;
        CountSquareofNumber(num);
    }

    public static void CountSquareofNumber(int num) {
int count = 0;
int temp = num;

while(temp!=0){
    temp = temp/10;
    count++;

}
        System.out.println("the count is "+num+ "is "+count);
        int square = num*num;
        System.out.println("the square is "+num+ "is "+square);
    }
}
