package ch04.Answer.Answer3;

public class Book {
    String title;
    String author;
    int price;

    public Book() {
    }

    public Book(String title) {
        System.out.println("Book 의 생성자(title 생성자)");
        this.title = title;
    }

    public Book(String title, String author) {
        System.out.println("Book 의 생성자(title 생성자, author 생성자)");
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int price) {
        System.out.println("Book 의 생성자(title 생성자, author 생성자, price 생성자)");

        this.title = title;
        this.author = author;
        this.price = price;
    }
}
