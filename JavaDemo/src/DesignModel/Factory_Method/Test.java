package DesignModel.Factory_Method;


/**
 * 凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建.
 * 如果传入的字符串有误，不能正确创建对象
 * */
public class Test {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("sms");
        sender.send();
    }
}
