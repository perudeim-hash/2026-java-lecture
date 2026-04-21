package ch07.lang.wrapper;

public class WrapperClassTest01 {
    public static void main(String[] args) {

//        int num = 10;
        Integer integer = new Integer(10); // 기본타입 int를 Integer(객체) 형태로 Wrapper했다.
        Integer integerObject = Integer.valueOf(100);
        System.out.println("integer = " + integer); // 값을 출력할때 기본형으로 unboxing 해준다.
        System.out.println("integerObject = " + integerObject);
        Integer integerObject01 = Integer.valueOf(100);
        System.out.println(integerObject == integerObject01);

//        Double double01 = Double.valueOf(10.5);
//        Character character01 = Character.valueOf('c');

    }
}
