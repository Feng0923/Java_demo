package DesignModel.Factory_Method;

public class SendFactory {
    public Sender produce(String type){
        Sender sender = null;
        if (type.equalsIgnoreCase("mail")){
            sender = new MailSender();
        }else if(type.equalsIgnoreCase("sms")){
            sender = new SMSSender();
        }
        return sender;
    }
}
