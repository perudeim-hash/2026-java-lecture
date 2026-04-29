package ch11.ex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을
//문자로 입력받아 ArrayList에 저장하고, ArrayList를 검색하여
//학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여
//평균을 출력하는 프로그램을 작성하라.
public class Test01 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String num = scanner.nextLine();
            if (stringList.size() > 5) {
                break;
            }
            System.out.println("학점이 입력됐습니다.");
            stringList.add(num);
        }
        int count = stringList.size();
        double score = 0;

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).equals("A")) {
                score +=  4.0;
            } else if (stringList.get(i).equals("B")) {
                score += 3.0;
            } else if (stringList.get(i).equals("C")) {
                score += 2.0;
            } else if (stringList.get(i).equals("D")) {
                score += 1.0;
            } else {
                score += 0.0;
            }

        }
        double total = score/count;
        System.out.println("총 합의 평균은 : " + total );

    }
}
