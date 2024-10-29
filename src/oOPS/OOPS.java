package oOPS;

class pen{
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }
        public void printcolor(){
            System.out.println(this.color);
        }
public void type(){
    System.out.println(this.type);
}
    }


public class OOPS {
    public static void main(String[] args) {
        pen s1 = new pen();
        s1.color = "blue";
        s1.type = "gel";

        pen s2 = new pen();
        s2.color = "black";
        s2.type = "ball";

        s1.printcolor();
        s1.type();
        s2.printcolor();
        s2.type();

    }
}
