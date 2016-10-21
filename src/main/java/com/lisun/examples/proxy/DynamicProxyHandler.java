package com.lisun.examples.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by alekseylisun.
 *
 * @since 19.10.16
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("***Proxy: " + proxy.getClass() + ", method " + method + ", args: " + Arrays.toString(args));
        return method.invoke(proxied, args);
    }
}
