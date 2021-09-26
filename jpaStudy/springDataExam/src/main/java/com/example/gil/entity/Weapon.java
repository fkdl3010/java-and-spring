package com.example.gil.entity;

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
public class Weapon extends Base{

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String category;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;
}
