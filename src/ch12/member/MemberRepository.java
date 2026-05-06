package ch12.member;

import java.util.List;

// 메서드 정의
public interface MemberRepository {
    void add(Member member);
    List<Member> findAll();

}
