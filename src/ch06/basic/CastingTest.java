package ch06.basic;

public class CastingTest {
    public static void main(String[] args) {
        Parent poly = new Child();
        Child child = (Child) poly;
        child.childMethod();

//        Child child02 = new Child();
//        Parent parent02 = (Parent) child02;

//        Parent parent = new Parent();
//        Child child1 = (Child) parent;
//        child1.childMethod();
        // runtime error-> dawnCasting 은 위험하다
    }
}
