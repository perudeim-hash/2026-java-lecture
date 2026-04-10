package ch04.Answer.Answer3;

public class BookTest {
    public static void main(String[] args) {

        Book book = new Book();
        book.title = "홍길동전";
        book.author = "허균";
        book.price = 12000;
        System.out.println("책의 이름은 : " + book.title + " / 글쓴이는 : " + book.author + " / 가격은 : " + book.price);

        Book book1 = new Book("삼국지");
        book1.author = "누군가";
        book1.price = 27000;
        System.out.println("책의 이름은 : " + book1.title + " / 글쓴이는 : " + book1.author + " / 가격은 : " + book1.price);

        Book book2 = new Book("원피스","오다");
        book2.price = 127000;
        System.out.println("책의 이름은 : " + book2.title + " / 글쓴이는 : " + book2.author + " / 가격은 : " + book2.price);


        Book book3 = new Book("아무거나","나도몰라",54000);
        System.out.println("책의 이름은 : " + book3.title + " / 글쓴이는 : " + book3.author + " / 가격은 : " + book3.price);




    }
}
