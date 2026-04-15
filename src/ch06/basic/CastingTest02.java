package ch06.basic;

public class CastingTest02 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("parent 호출");
        // 다운 캐스팅을 통해서 자식 메서드를 호출할 때 instanceof 를 사용해서 타임 체크를 하는게 좋다
        // instanceof -> 왼쪽에 있는게 오른쪽에 있는것과 참인지 거짓인지 비교한다
        if (parent instanceof Child) {
            Child child01 = (Child) parent;
            child01.childMethod();
        } else {
            parent.parentMethod();
        }

        Parent parent02 = new Child();
        System.out.println("parent02 호출");
        if (parent02 instanceof Child) {
            Child child02 = (Child) parent02;
            child02.childMethod();
        } else {
            parent02.parentMethod();
        }


        System.out.println("==================" + (new Parent() instanceof Parent));
        System.out.println("==================" + (new Child() instanceof Parent));
        System.out.println("==================" + (new Parent() instanceof Child));
        System.out.println("==================" + (new Child() instanceof Child));



    }
}
