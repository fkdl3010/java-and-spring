package me.gil.junitstudy.member;

import java.util.Optional;
import me.gil.junitstudy.domain.Member;
import me.gil.junitstudy.domain.Study;

public interface MemberService {

    Optional<Member> findById(Long memberId);

    void validate(Long memberId);

    void notify(Study newstudy);

    void notify(Member member);

    default void print(){
        System.out.println("dorealMethod");
    }
}
