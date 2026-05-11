package ch14.lamda.methodRef;

import java.util.function.Supplier;

public class MethodRefEx01 {
    public static void main(String[] args) {
        // static 메서드 호출
        Supplier<String> staticMethod01 = () -> Person.greeting();
        System.out.println("staticMethod01.get() = " + staticMethod01.get());
        Supplier<String> staticMethod02 =  Person::greeting;
        System.out.println("staticMethod02.get() = " + staticMethod02.get());

        System.out.println("==================================================");
        // 특정 객체의 인스턴스 참조
        Person person = new Person("홍길동");
        Supplier<String> instanceMethod01 = () -> person.introduce();
        System.out.println("instanceMethod01.get() = " + instanceMethod01.get());
        Supplier<String> instanceMethod02 = person::introduce;
        System.out.println("instanceMethod02.get() = " + instanceMethod02.get());

        System.out.println("==================================================");
        // 생성자 참조
        Supplier<Person> newPerson01 = () -> new Person();
        System.out.println("newPerson01 = " + newPerson01.get());
        Supplier<Person> newPerson02 = Person::new;
        System.out.println("newPerson02 = " + newPerson02.get());

        Supplier<Person> newPerson03 = () -> new Person();
        System.out.println(newPerson03.get().introduceWithNumber(111));


    }
}
