package oOPS;

class student{
    String name ;
    int age;

    public void printInfo(String name){
        System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(this.age);
    }
    public void printInfo(String name , int age){
        System.out.println(name +" " +age);
    }
}

public class overloading {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Rahul";
        s1.age = 24;
        s1.printInfo(s1.age);
    }
}
