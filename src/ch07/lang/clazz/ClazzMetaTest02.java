package ch07.lang.clazz;

import java.lang.reflect.InvocationTargetException;

public class ClazzMetaTest02 {
    public static void main(String[] args) throws Exception {
        // 동적 호출  reflection
        Class helloClass = Class.forName("ch07.lang.clazz.Hello"); // Class 를 동적으로 호출이 가능하다.
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
