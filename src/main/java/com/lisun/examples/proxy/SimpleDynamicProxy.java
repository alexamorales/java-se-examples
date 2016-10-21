package com.lisun.examples.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by alekseylisun.
 *
 * @since 19.10.16
 */
public class SimpleDynamicProxy {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("SimpleDynamic with parameters");
    }

    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        consumer(realObject);

        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(realObject));

        consumer(proxy);

    }



}
