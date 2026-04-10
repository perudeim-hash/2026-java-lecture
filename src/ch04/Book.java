package ch04;


public class Book {
    String author;
    String title;

    /**
     * this는 class 자신을 가리킨다
     * 주로 멤버 변수에 접근할 때 사용하며 생략이 가능하다.
     */

    public Book() {
        System.out.println("Book 의 생성자(아무것도 없음)");
        author = "사마천";
        title = "사기";
    }

    public Book(String author) {
        System.out.println("Book 의 생성자(author 생성자)");
        title = "셰익스피어의 4대 비극";
        this.author = author;

    }

    public Book(String author, String title) {
        System.out.println("Book 의 생성자(author,title 생성자)");

        this.author = author;
        this.title = title;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}