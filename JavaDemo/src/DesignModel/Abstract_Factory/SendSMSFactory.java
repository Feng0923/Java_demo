package DesignModel.Abstract_Factory;

public class SendSMSFactory implements Provider {
    @Override
    public Sender produce() {
        return new SMSSender();
    }
}
