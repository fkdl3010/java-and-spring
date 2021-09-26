package com.example.gil.service;

import com.example.gil.entity.Member;
import com.example.gil.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;



    public void save(Member member) {
        memberRepository.save(member);
    }
}
