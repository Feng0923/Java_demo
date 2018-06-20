package Extends;


/**
 * this 的多态性
 * */
public class Main2 {
    public static void main(String[] args) {
        C c = new D();
        c.fun1();
        c.fun2();
    }
}
class C{
    public void fun1(){
        System.out.println("this is C fun1");
    }

    public void fun2(){
        this.fun1();
    }
}
class D extends C{
    @Override
    public void fun1() {
        System.out.println("this is D fun1");
    }

    public void fun3(){
        System.out.println("this is D fun3");
    }
}
