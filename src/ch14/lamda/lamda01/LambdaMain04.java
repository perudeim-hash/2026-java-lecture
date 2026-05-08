package ch14.lamda.lamda01;

import ch14.lamda.MyFunction;

public class LambdaMain04 {
    public static void main(String[] args) {

        MyCall myCall01 = (int value) -> value * 2;
        MyCall myCall02 = ( value) -> value * 2;
        MyCall myCall03 = value -> value * 2;

        System.out.println(myCall03.call(10));


    }

    @FunctionalInterface
    interface MyCall {
        int call(int value);
    }

}
