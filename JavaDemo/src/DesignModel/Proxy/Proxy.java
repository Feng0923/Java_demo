package DesignModel.Proxy;

public class Proxy implements SourceAble {

    private Source source = null;
    public Proxy(){
        super();
        source = new Source();
    }
    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void before(){
        System.out.println("before");
    }

    private void after(){
        System.out.println("after");
    }
}
