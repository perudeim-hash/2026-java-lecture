package ch04;

public class CatTest {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "미묘";
        cat.category = "코숏";
        cat.age = 3;
        System.out.println(cat.name + " : " + cat.category + " : " + cat.age + " : ");


        Cat cat02 = new Cat();
        cat02.name = "야옹2";
        cat02.category = "길고양2";
        cat02.age = 3;
        System.out.println(cat02.name + " : " + cat02.category + " : " + cat02.age + " : ");


        Cat[] cats = new Cat[2];
        cats[0] = cat;
        cats[1] = cat02;
        System.out.println(cats[0].name);

        for (Cat cat1 : cats) {
            System.out.println(cat1.name + " " + cat1.age);

        }


    }
}
