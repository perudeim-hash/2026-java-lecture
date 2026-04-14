package ch05.casting;

public class PolyTest {
    public static void main(String[] args) {
        System.out.println("Parent => Child");
        Parent parent = new Parent();
        parent.parentMethod();
        System.out.println("==================================");
        // 자식을 부모타입으로 변환
        System.out.println("Child => Parent");
        Child child = new Child();
        child.childMethod();
        child.parentMethod();
        System.out.println("==================================");
        //부모가 자식을 참조
        Parent poly = new Child();
        poly.parentMethod();
        System.out.println("==================================");
        Child polyChild = (Child) poly;
        polyChild.childMethod();

    }
}
