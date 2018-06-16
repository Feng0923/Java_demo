package static_proxy;

/*
委托类(包含业务逻辑)处理业务(写具体实现方法)
 */
public class CountImpl implements Count {
    public void queryCount(){
        System.out.println("查看账户方法");
    }

    @Override
    public void updateCount() {
        System.out.println("修改账户方法");
    }
}
