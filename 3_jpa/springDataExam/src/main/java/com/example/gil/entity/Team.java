package com.example.gil.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Team extends Base{

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String country;

    @OneToMany( cascade = CascadeType.ALL)
    @JoinColumn(name = "TEAM_ID")
    private List<Member> memberList;
}
