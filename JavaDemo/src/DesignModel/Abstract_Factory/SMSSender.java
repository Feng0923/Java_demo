package DesignModel.Abstract_Factory;


public class SMSSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender");
    }
}
