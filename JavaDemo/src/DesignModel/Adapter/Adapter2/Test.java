package DesignModel.Adapter.Adapter2;

/**
 * 接口的适配器模式：当不希望实现一个接口中所有的方法时，可以创建一个抽象类，实现所有方法，我们写别的类的时候，继承抽象类即可。
 * */
public class Test {
    public static void main(String[] args) {
        Adapter adapter1 = new Adapter1();
        Adapter adapter2 = new Adapter2();

        adapter1.method1();
        adapter1.method2();

        adapter2.method1();
        adapter2.method2();
    }
}
