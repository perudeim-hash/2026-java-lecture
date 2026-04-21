package ch07.review;

public class ObjectTest {
    public static void main(String[] args) {
        action(new Pig());
        action(new Airplane());
    }

    static void action(Object object) {
        if (object instanceof Pig pig) {
            pig.sound();
        } else if (object instanceof Airplane airplane) {
            airplane.fly();
        }
    }
}

class Pig {
    public void sound() {
        System.out.println("꿀꿀");
    }
}

class Airplane {
    public void fly() {
        System.out.println("하늘을 날아다닙니다.");
    }
}
