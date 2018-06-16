package static_proxy;//import sun.applet.Main;

public class TestDemo {
    public static void main(String[] args) {
        CountProxy countProxy = new CountProxy(new CountImpl());
        countProxy.queryCount();
        countProxy.updateCount();
    }
}
