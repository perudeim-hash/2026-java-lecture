package ch11.compare.Answer;

import java.util.Arrays;
import java.util.Comparator;

public class Answer11 {
    public static void main(String[] args) {
        Order[]orders= {
                new Order("kim",3000,2),
                new Order("lee",2000,5),  // 총합 10000원
                new Order("kim",1000,5),
                new Order("park",3000,1),
                new Order("lee",2000,3)
        };
        Arrays.sort(orders, new OrderComparator());
        System.out.println(Arrays.toString(orders));
    }
}

class Order {
    String name;
    int price;
    int quantity;

    public Order(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotal(){
        return price * quantity;
    }

    @Override
    public String toString() {
        return
                "이름 =" + name +
                ", 가격 =" + price +
                ", 갯수 =" + quantity +
                 ", 총 금액 =" + getTotal()
                ;
    }
}

class OrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        int result = Integer.compare(o2.getTotal(),o1.getTotal());
        if (result == 0) {
            result = Integer.compare(o2.getQuantity(),o1.getQuantity());
        }
        if (result == 0) {
            result = o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}