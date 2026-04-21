package ch07.review;

public class StringTest {
    public static void main(String[] args) {
        String hello = new String("hello");
        String hello02 = new String("hello");

        String world = "world";
        String world2 = "world";

        System.out.println(hello == hello02);
        System.out.println(hello.equals(hello02));
        System.out.println(world == world2);
        System.out.println(world.equals(world2));

    }
}
