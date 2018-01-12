package static_proxy;

/*
这是一个代理类(增强CountImpl实现类)
 */
public class CountProxy implements Count {
    private CountImpl countImpl;
    public CountProxy(CountImpl countImpl){
        this.countImpl = countImpl;
    }
    @Override
    public void queryCount() {
        System.out.println("事物处理之前");
        countImpl.queryCount();
        System.out.println("事物处理之后");
    }

    @Override
    public void updateCount() {
        System.out.println("事物处理之前");
        countImpl.updateCount();
        System.out.println("事物处理之后");
    }
}
