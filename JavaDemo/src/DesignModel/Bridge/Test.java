package DesignModel.Bridge;


/**
 * 对同一个行为的不同实现
 * */
public class Test {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        SourceAble source1 = new Source1();
        bridge.setSource(source1);
        bridge.method();

        SourceAble source2 = new Source2();
        bridge.setSource(source2);
        bridge.method();
    }
}
