package Copy_Clone;

/**
 * 有关于  复制与克隆的demo
 * */
public class Main {
    public static void main(String[] args) {
        A a = new A(1);
        A a1 = a; // 浅复制
        A a2 = a.clone(); //克隆(深复制)
        System.out.println("原: "+a.getIndex());
        System.out.println("浅复制: " + a1.getIndex());
        System.out.println("克隆: " + a2.getIndex());
        a.add();
        System.out.println("--------------");
        System.out.println("原: "+a.getIndex());
        System.out.println("浅复制: " + a1.getIndex());
        System.out.println("克隆: " + a2.getIndex());

    }
}
class A{

    private int index;

    public A(int index){
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void add(){
        index++;
    }

    public A clone(){
        return new A(index);
    }
}

