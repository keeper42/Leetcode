package com.keeper42.test;

import java.lang.reflect.Proxy;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/3/10
 */
public class Test2 {

    public static void main(String[] args) {

//        InvocationHandler handler = (proxy, method, args1) -> {
//            if (method.getName().equals("morning")) {
//                System.out.println("Good morning, " + args1[0]);
//            }
//            if (method.getName().equals("afternoon")) {
//                System.out.println("Good afternoon, " + args1[0]);
//            }
//            return null;
//        };
//
//        Hello hello = (Hello) Proxy.newProxyInstance(
//                Hello.class.getClassLoader(),
//                new Class[] { Hello.class },
//                handler);

        Hello hello = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(),
                new Class[]{Hello.class},
                (proxy, method, arg) -> {
                    if (method.getName().equals("morning")) {
                        System.out.println("Good morning, " + arg[0]);
                    }
                    if (method.getName().equals("afternoon")) {
                        System.out.println("Good afternoon, " + arg[0]);
                    }
                    return null;
                }
        );

        hello.morning("Bob");
        hello.afternoon("Amy");

    }

}
