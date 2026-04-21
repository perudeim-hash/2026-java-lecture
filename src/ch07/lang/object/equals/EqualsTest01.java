package ch07.lang.object.equals;

public class EqualsTest01 {
    public static void main(String[] args) {
        UserV1 user01 = new UserV1("id-001");
        UserV1 user02 = new UserV1("id-001");
        UserV1 user03 = user01;
        System.out.println(user01 == user02);
        System.out.println(user01.equals(user02));
        System.out.println(user01 == user03);
    }
}
