package ch06.overriding;

public class OverridingTest {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child => Child");
        System.out.println("child.value = " + child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println("Parent => Parent");
        System.out.println("parent.value = " + parent.value);
        parent.method();


        Parent poly = new Child();
        System.out.println("Parent => Child");
        System.out.println("poly.value = " + poly.value); // Parent
        poly.method(); // Child 동적 바인딩 -> 부모 타입이지만 메서드 오버라딩을 하면 자식 메서드가 호출 된다.




    }
}
