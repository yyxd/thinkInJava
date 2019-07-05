package proxy;

import java.lang.reflect.Proxy;

/**
 * Created by Diane on 2019-07-05.
 * Goal: JDK的动态代理：面向接口
 */
public class Main {
    public static void main(String[] args) {
        Hello hello =new HelloIml();
        DynamicProxy dynamicProxy = new DynamicProxy(hello);//hello 接口的动态代理
        Hello helloProxy = (Hello) Proxy.newProxyInstance(
                hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(),
                dynamicProxy
        );
        AntherInterface another = new HelloIml();
        DynamicProxy dynamicProxy1 = new DynamicProxy(another);
        AntherInterface anotherProxy = (AntherInterface) Proxy.newProxyInstance(
                another.getClass().getClassLoader(),
                another.getClass().getInterfaces(),
                dynamicProxy1
        ) ;

//        System.out.println(hello.getClass().getName());
        helloProxy.saySth("Jack");
//        hello.saySth("Jack");
        anotherProxy.another("====");
//        ((HelloIml)hello).sayMySchool("BeiHang");
    }
}
