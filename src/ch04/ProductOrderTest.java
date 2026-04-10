package ch04;

public class ProductOrderTest {
    public static void main(String[] args) {

        ProductOrder order01 = new ProductOrder();
        order01.ProductName = "옷1";
        order01.ProductPrice = 10000;
        order01.ProductQuantity = 10;

        ProductOrder order02 = new ProductOrder();
        order02.ProductName = "옷2";
        order02.ProductPrice = 15000;
        order02.ProductQuantity = 15;

        ProductOrder order03 = new ProductOrder();
        order03.ProductName = "옷3";
        order03.ProductPrice = 20000;
        order03.ProductQuantity = 22;

        ProductOrder order04 = new ProductOrder();
        order04.ProductName = "옷4";
        order04.ProductPrice = 50000;
        order04.ProductQuantity = 16;

        ProductOrder order05 = new ProductOrder();
        order05.ProductName = "바지4";
        order05.ProductPrice = 67000;
        order05.ProductQuantity = 18;


        ProductOrder[] order1 = new ProductOrder[5];
        order1[0] = order01;
        order1[1] = order02;
        order1[2] = order03;
        order1[3] = order04;
        order1[4] = order05;


        int totalPrice = 0;
        for (ProductOrder order : order1) {
            System.out.println("제품 명 : " + order.ProductName + " / 가격 : " + order.ProductPrice + " / 수량 : " + order.ProductQuantity);
            totalPrice = order.ProductPrice + totalPrice;
        }

        System.out.println("총 가격 : " + totalPrice);
    }

}
