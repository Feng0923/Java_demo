package DesignModel.Observer;

public class MySubject extends AbstarctSubject {
    @Override
    public void operation() {
        System.out.println("update self");
        notifyObservers();
    }
}
