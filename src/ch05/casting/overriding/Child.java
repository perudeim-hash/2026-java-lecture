package ch05.casting.overriding;

public class Child extends Parent {
    String value = "child";
    @Override
    void method() {
        System.out.println("Child => childMethod");
    }

}
