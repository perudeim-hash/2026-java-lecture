package ch05.casting.abs;

public class AnimalTest {
    static void soundAnimal(Animal animal) {
        //속성은 overriding 이 되지 않는다.
        //Method 만 overriding 가 된다.
        System.out.println(animal.value);

        animal.sound();
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();
        Chicken chicken = new Chicken();
        Pig pig = new Pig();
        // 추상 클래스(abstract)는 instance 를 만들 수 없다.
//        Animal animal =new Animal()

        int[] arr = {1, 2, 3, 4};
        Animal[] animals = {cat, dog, caw, chicken, pig};
        for (Animal animal : animals) {
            animal.sound();
            animal.move();
        }
//        soundAnimal(cat);
//        soundAnimal(dog);
//        soundAnimal(caw);
//        soundAnimal(chicken);


    }
}
