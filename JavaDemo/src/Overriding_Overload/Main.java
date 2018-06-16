package Overriding_Overload;

import cglib_proxy.BookDAOImpl;

/**
 * 有关于 重载, 改写, 遮蔽
 * */
public class Main {
    public static void main(String[] args) {
        A m = new B();
        m.print();
        m.print();

        B b = (B) m;
        //要看此时类的类型是什么,才能决定index的值.
        System.out.println(m.index);
        System.out.println(b.index);
    }
}
class A{
    public int index = 1;
    protected void print(){
        System.out.println("I am A");
    }

    void to(){
        System.out.println("孩子你是最棒的!");
    }
}

class B extends A{
    public int index = 2;
    @Override
    protected void print() {
        System.out.println("I am B");
    }
}