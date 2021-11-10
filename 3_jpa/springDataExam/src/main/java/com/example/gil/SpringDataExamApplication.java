package com.example.gil;

import com.example.gil.entity.Member;
import com.example.gil.entity.Team;
import com.example.gil.repository.MemberRepository;
import com.example.gil.repository.TeamRepository;
import com.example.gil.service.MemberService;
import com.example.gil.service.TeamService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EntityScan
public class SpringDataExamApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(SpringDataExamApplication.class, args);

        MemberRepository memberRepository = context.getBean(MemberRepository.class);
        MemberService memberService = new MemberService();
        TeamRepository teamRepository = context.getBean(TeamRepository.class);
        TeamService teamService = new TeamService();


        Team team = new Team();
        team.setName("BigTeam");


        Member member = new Member();
        member.setName("상길이");
//        member.setTeam(team);

        List<Member> memberList = new ArrayList<>();
        memberList.add(member);

        team.setMemberList(memberList);

        teamRepository.save(team);


    }

}
