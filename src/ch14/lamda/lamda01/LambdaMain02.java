package ch14.lamda.lamda01;

import ch14.lamda.MyFunction;
import ch14.lamda.Procedure;

public class LambdaMain02 {
    public static void main(String[] args) {

        Procedure procedure01 = () -> {
            System.out.println("hello");
        };

        Procedure procedure02 = () -> System.out.println("hello");



        MyFunction myFunction01 = new MyFunction() {
            @Override
            public int apply(int a, int b) {
                return a + b;
            }
        };

        MyFunction myFunction02 = (int a , int b)-> {
                return a + b;
        };

        MyFunction myFunction03 = (int a, int b) -> a + b;

        MyFunction myFunction04 = (int a, int b) -> {
            System.out.println(a + "=========" + b);
            return a + b;
        };



        System.out.println("myFunction01 = " + myFunction01.apply(10, 20));
        System.out.println("myFunction02 = " + myFunction02.apply(20, 50));
        System.out.println("myFunction03. = " + myFunction03.apply(100, 200));
        System.out.println("myFunction04. = " + myFunction04.apply(200, 300));
        procedure01.run();
        procedure02.run();
    }

}
