package ch08.enumeration.ex05;


public class EnumGradeTest01 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        int price = 10000;
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
