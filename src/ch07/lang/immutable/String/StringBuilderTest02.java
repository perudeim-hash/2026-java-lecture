package ch07.lang.immutable.String;

public class StringBuilderTest02 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        String result = "";
//        for (int i = 0; i < 100000;i++) {
//            result += "hello java";
//        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append("hello java");
        }
        String result = stringBuilder.toString();
        long endTime = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("Time : " + (endTime - startTime));

        // Method 체이닝
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("A")
                .append("B")
                .append("C")
                .reverse();
        System.out.println(stringBuilder1);

    }
}
