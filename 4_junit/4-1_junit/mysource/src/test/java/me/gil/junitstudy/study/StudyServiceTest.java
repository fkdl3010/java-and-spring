package me.gil.junitstudy.study;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.List;
import java.util.Optional;
import me.gil.junitstudy.domain.Member;
import me.gil.junitstudy.domain.Study;
import me.gil.junitstudy.member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.AdditionalMatchers;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@ExtendWith(MockitoExtension.class)
class StudyServiceTest {

    @Mock MemberService memberService;
    @Mock StudyRepository studyRepository;
    @Mock Study mockStudy;

    @Test
    void createNewStudy(
    ){
        StudyService studyService = new StudyService(memberService, studyRepository);
        assertNotNull(studyService);

        Member member = new Member();
        member.setId(1L);
        member.setEmail("fkdl3919@icloud.com");
        // when: ~ 일 때 , thenReturn: ~ 을 리턴하라
        when(memberService.findById(ArgumentMatchers.any()))
                .thenReturn(Optional.of(member))
                .thenThrow(new RuntimeException())
                .thenReturn(Optional.of(member));

        Study study = new Study(10, "java");
        assertEquals("fkdl3919@icloud.com", memberService.findById(2L).get().getEmail());
        assertThrows(RuntimeException.class, () -> {
            memberService.findById(1L);
        });
        assertEquals("fkdl3919@icloud.com", memberService.findById(3L).get().getEmail());
//        studyService.createNewStudy(1L, study);

    }



    @Test
    void createNewStudy1(
    ){
        StudyService studyService = new StudyService(memberService, studyRepository);
        assertNotNull(studyService);

        Member member = new Member();
        member.setId(1L);
        member.setEmail("fkdl3919@icloud.com");

        Study study = new Study(10, "java");

        Study newStudy = new Study(20, "gil");

        when(memberService.findById(1L)).thenReturn(Optional.of(member));
        when(studyRepository.save(study)).thenReturn(study);
        doCallRealMethod().when(mockStudy).doRealMethodTest();
        mockStudy.doRealMethodTest();

        studyService.createNewStudy(1L,study);
        // 적합성 검증
        verify(memberService, times(1)).notify(study);
        verify(memberService, times(1)).notify(member);
        verify(memberService, never()).validate(any());

        InOrder inOrder = inOrder(memberService);
        inOrder.verify(memberService).notify(study);
        inOrder.verify(memberService).notify(member);

        verifyNoMoreInteractions(memberService);

    }

    @Test
    void createDoRealMethodTest(){

        Mockito.doCallRealMethod().when(mockStudy).doRealMethodTest();
        mockStudy.doRealMethodTest();
    }

}