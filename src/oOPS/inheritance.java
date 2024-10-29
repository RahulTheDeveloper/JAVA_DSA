package oOPS;

import org.w3c.dom.ls.LSOutput;

class shape{
    String color;
    public void area(){
        System.out.println("Display area of shape");
    }

}
class Triangle extends shape{
public void area(int h, int b){
    System.out.print((0.5)*b*h);
}

}
public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.area(7,8);

    }
}
