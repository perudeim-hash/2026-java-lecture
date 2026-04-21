package ch07.lang.immutable.String;

public class StringFormat {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 20;
        double score = 99.4;
        String result = String.format("이름 : [%10s], 나이 : %d, 점수 : %.1f", name, age, score); // 양수는 앞으로 숫자만큼 자리를 만들어주고
        String result2 = String.format("이름 : [%-10s], 나이 : %d, 점수 : %.1f", name, age, score); // 음수는 뒤로 숫자만큼 자리를 만들어준다.
        String result3 = "이름 : [%-10s], 나이 : %d, 점수 : %.1f".formatted(name, age, score); // 음수는 뒤로 숫자만큼 자리를 만들어준다.
        String html = """
                <div>
                    <h1>%s</h1>
                    <p>점수 : %.2f</p>
                </div>
                """.formatted(name, score);
        System.out.println(html);

        System.out.println(result);
        System.out.println(result2);

    }
}
