package ch07.lang.object.poly;

public class ObjectPolyTest01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        action(car);
        action(dog);

    }

    static void action(Object object) {
        //down casting
        if (object instanceof Dog dog) {
            dog.sound();
        } else if (object instanceof Car car) {
            car.move();

        }
    }
}
