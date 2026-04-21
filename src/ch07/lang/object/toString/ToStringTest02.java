package ch07.lang.object.toString;

public class ToStringTest02 {
    public static void main(String[] args) {
        Car car = new Car("K5");
//        System.out.println(car.toString());
//        ObjectPrinter.print(car);
        Dog dog = new Dog("댕댕2", 4);
        System.out.println(dog.toString());
        ObjectPrinter.print(dog);
    }
}
