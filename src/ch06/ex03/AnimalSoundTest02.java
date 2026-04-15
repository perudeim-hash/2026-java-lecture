package ch06.ex03;


public class AnimalSoundTest02 {
    static void soundAnimal(Animal animal) {
        animal.sound();

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        System.out.println("동물 소리 테스트 시작");

        Animal[] animals = {dog, cat, caw};
        // 향상된 for문(iter)
        for (Animal animal : animals) {
            animal.sound();
        }
        System.out.println("동물 소리 테스트 끝");

    }
}
