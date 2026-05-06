package ch12.member;

import java.util.List;
import java.util.Scanner;

public class MemberConsoleMain {

//    private static final MemberRepository memberRepository = new FileMemberRepository();
//    private static final MemberRepository memberRepository = new DataMemberRepository();
    private static final MemberRepository memberRepository = new ObjectRepository();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. 회원 등록 | 2. 회원 목록 | 3. 종료");
            System.out.print("메뉴 선택 ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> signup(scanner);
                case 2 -> showAll();
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }

                default -> System.out.println("잘못된 메뉴 입니다.");

            }
        }
    }

    private static void showAll() {
        List<Member> members = memberRepository.findAll();
        System.out.println("회원 목록 : ");
        for (Member member : members) {
            System.out.printf("[Id : %s | Name : %s | Age : %d]\n", member.getId(), member.getName(), member.getAge());

        }
    }

    private static void signup(Scanner scanner) {
        System.out.print("ID 입력 : ");
        String id = scanner.nextLine();
        System.out.println("ID가 입력됐습니다. : " + id);
        System.out.print("이름 입력 : ");
        String name = scanner.nextLine();
        System.out.print("나이 입력 : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        Member member = new Member(id, name, age);
        memberRepository.add(member);

    }
}
