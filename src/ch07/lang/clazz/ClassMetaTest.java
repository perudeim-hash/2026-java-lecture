package ch07.lang.clazz;

import java.lang.reflect.Field;

public class ClassMetaTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = String.class;
//        Class clazz02 = new String().getClass();
//        Class clazz03 = Class.forName("java.lang.String");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
//            System.out.println("field = " + field);
            System.out.println(field.getType()+ " " + field.getName());
        }
        System.out.println(clazz.getSuperclass().getName());
    }
}
