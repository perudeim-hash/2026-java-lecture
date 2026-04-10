package ch04;

public class BookTest {
    public static void main(String[] args) {

        Book book = new Book();
        System.out.println("책의 이름은 : " + book.title + " / 글쓴이는 : " + book.author);
        
        
        Book book1 = new Book("셰익스피어");
        System.out.println("책의 이름은 : " + book1.title + " / 글쓴이는 : " + book1.author);
        
        
        Book book2 = new Book("진수", "삼국지");
        System.out.println("책의 이름은 : " + book2.title + " / 글쓴이는 : " + book2.author);

        System.out.println(book2.toString());

        
        

    }
}
