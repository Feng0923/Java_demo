package cglib_proxy;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookFacadeCglib implements org.springframework.cglib.proxy.MethodInterceptor{
    private Object target;

    /**
     * 创建代理对象
     * @param target
     * @return
     */
    public Object getInstace(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this); //回调方法
        return enhancer.create();  //创建代理对象
    }

    /*
    回调方法
    调用此方法的类就是Callback类,也就是代理类BookFacadeCglib自身通过Enhancer的setCallback方法进行设置
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("事物开始");
        methodProxy.invokeSuper(o,objects);//调用super也就是被代理类的方法
        System.out.println("事物结束");
        return null;
    }
}
