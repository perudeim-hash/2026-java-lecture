package review.clazz.class01;

public class ProductOrderTest {
    public static void main(String[] args) {
        ProductOrder order = new ProductOrder();
        order.productName = "두부";
        order.price = 2000;
        order.quantity = 5;

        ProductOrder order02 = new ProductOrder();
        order02.productName = "피자";
        order02.price = 29500;
        order02.quantity = 2;


        ProductOrder order03 = new ProductOrder();
        order03.productName = "햄버거";
        order03.price = 7800;
        order03.quantity = 5;

        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = order;
        orders[1] = order02;
        orders[2] = order03;
        int total = order.price + order02.price + order03.price;
        for (ProductOrder productOrder : orders) {
            System.out.println("상품명 : " + productOrder.productName + " / 가격 : " + productOrder.price + " / 수량 : " + productOrder.quantity
            );
        }


    }
}
