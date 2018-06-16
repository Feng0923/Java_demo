package Extends;

public class Main {
    public static void main(String[] args) {
        A m = new B();
        System.out.println("-----------");
        A x = new B(2);
    }
}
class A{
    A(){
        System.out.println("I am A ");
    }
    A(int i){
        System.out.println("I am A " + i);
    }
}
class B extends A{
    B(){
        System.out.println("I am B ");
    }
    B(int i){
        System.out.println("I am B " + i);
    }
}
