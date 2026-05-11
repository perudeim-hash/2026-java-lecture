package ch14.lamda.methodRef;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefEx02 {
    public static void main(String[] args) {
        Person person01 = new Person("홍길동");
        Person person02 = new Person("전세진");
        Person person03 = new Person("누군가");
        Function<Person, String> function01 = (Person person) -> person.introduce();
        System.out.println("function01.introduce(person01) = " + function01.apply(person01));
        System.out.println("function01.introduce(person02) = " + function01.apply(person02));
        System.out.println("function01.introduce(person03) = " + function01.apply(person03));

        System.out.println("================================================================");

        Function<Person, String> function02 = Person::introduce;
        System.out.println("function02.introduce(person01) = " + function02.apply(person01));
        System.out.println("function02.introduce(person02) = " + function02.apply(person02));
        System.out.println("function02.introduce(person03) = " + function02.apply(person03));



    }
}
