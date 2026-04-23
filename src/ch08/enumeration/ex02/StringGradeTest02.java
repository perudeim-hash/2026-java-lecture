package ch08.enumeration.ex02;

public class StringGradeTest02 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        int price = 10000;
        int basic = discountService.discount("VIP", price);
        int gold = discountService.discount("gold", price);
        int diamond = discountService.discount("diamondd", price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
