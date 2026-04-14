package ch05.casting.overriding;

public class PolyTest {
    public static void main(String[] args) {
        //자식에서 자식 참조
        Child child = new Child();
        System.out.println("Child => Child");
        System.out.println("value = " + child.value);
        child.method();
        System.out.println("======================================");
        //부모에서 부모 참조
        Parent parent = new Parent();
        System.out.println("Parent => Parent");
        System.out.println("value = " + parent.value);
        parent.method();
        System.out.println("======================================");
        //부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        System.out.println("Parent => Child");
        System.out.println("value = " + poly.value);
        // 자식이 부모 메서드를 Override 가 되어있으면 자식의 method 를 받아온다
        poly.method();  // 동적 바인딩
        
    }
}
