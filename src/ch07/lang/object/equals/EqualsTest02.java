package ch07.lang.object.equals;

public class EqualsTest02 {
    public static void main(String[] args) {
        UserV2 user01 = new UserV2("id-001");
        UserV2 user02 = new UserV2("id-001");


        System.out.println("identity = " + (user01==user02));
        System.out.println("equality = " + (user01.equals(user02)));
    }
}
