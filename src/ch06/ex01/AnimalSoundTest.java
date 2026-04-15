package ch06.ex01;

public class AnimalSoundTest {
    static void soundCaw(Caw caw) {
        caw.sound();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 끝");
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        soundCaw(caw);
    }
}
