package ch08.enumeration.ex05;


public class EnumGradeTest02 {
    public static void main(String[] args) {
        int basic = Grade.BASIC.discount(10000);
        int gold = Grade.GOLD.discount(10000);
        int diamond = Grade.DIAMOND.discount(10000);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
