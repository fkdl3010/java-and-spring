package me.gil.junitstudy.domain;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Study {


    @Id
    @GeneratedValue
    private Long id;
    private StudyStatus status = StudyStatus.DRAFT;
    private int limitCount;
    private String name;
    private LocalDateTime openDateTime;

    @ManyToOne
    @JoinColumn(name = "STUDY_MEMBER")
    private Member owner;

    public Study(int limit, String name) {
        this.limitCount = limit;
        this.name = name;
    }

    public Study(int limit) {
        if (limit < 0){
            throw new IllegalArgumentException("limit은 0보다 커야한다");
        }
        this.limitCount = limit;
    }

    public void open(){
        this.openDateTime = LocalDateTime.now();
        this.status = StudyStatus.OPENED;
    }

    @Override
    public String toString() {
        return "Study{" +
            ", limit=" + limitCount +
            ", name='" + name + '\'' +
            '}';
    }

    public void doRealMethodTest(){
        System.out.println("테스트입니다");
    }
}
