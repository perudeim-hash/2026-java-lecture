package ch07.lang.immutable.String.ex;

public class ex04 {
    public static void main(String[] args) {
        String fileName = "photo.png";
        int idx = fileName.lastIndexOf(".");

        System.out.println("파일 이름 : " + fileName.substring(0,5));
        System.out.println("확장자 : " + fileName.substring(idx + 1));

    }
}
