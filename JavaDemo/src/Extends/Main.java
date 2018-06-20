package Extends;

public class Main {
    public static void main(String[] args) {
        A m = new B();
        System.out.println("-----------");
        A x = new B(2);

        A a1 = new A();
        A a2 = new B();
        B b = new B();

        a1.speak(a1);
        a1.speak(a2);
        a1.speak(b);
        a2.speak(a1);
        a2.speak(a2);
        a2.speak(b);
        b.speak(a1);
        b.speak(a2);
        b.speak(b);
    }
}
class A{
    A(){
        System.out.println("I am A ");
    }
    A(int i){
        System.out.println("I am A " + i);
    }

    public void speak(A a){
        System.out.println("A");
    }
}

class B extends A{
    B(){
        System.out.println("I am B ");
    }
    B(int i){
        System.out.println("I am B " + i);
    }

    public void speak(A a){
        System.out.println("B");
    }

    public void speak(B b){
        System.out.println("BB");
    }
}
