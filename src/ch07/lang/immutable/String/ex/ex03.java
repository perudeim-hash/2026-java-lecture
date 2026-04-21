package ch07.lang.immutable.String.ex;

public class ex03 {
    public static void main(String[] args) {

        String fileName = "document.pdf";
        int idx = fileName.lastIndexOf(".");
        System.out.println(fileName.substring(idx + 1));

    }
}
