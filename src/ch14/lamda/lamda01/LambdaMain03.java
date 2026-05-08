package ch14.lamda.lamda01;

import ch14.lamda.MyFunction;
import ch14.lamda.Procedure;

public class LambdaMain03 {
    public static void main(String[] args) {

        MyFunction myFunction01 = ( int a,  int b) -> a + b;
        MyFunction myFunction02 = ( a,  b) -> a + b;





        System.out.println("myFunction01. = " + myFunction01.apply(10, 20));
        System.out.println("myFunction02. = " + myFunction02.apply(100, 200));


    }

}
