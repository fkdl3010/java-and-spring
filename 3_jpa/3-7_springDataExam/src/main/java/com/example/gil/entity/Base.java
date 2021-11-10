package com.example.gil.entity;

import java.time.LocalDateTime;
import javax.persistence.MappedSuperclass;

@MappedSuperclass

public class Base {

    private String createdBy;

    private LocalDateTime createdDate;

    private String lastModifiedBy;

    private LocalDateTime lastModifiedDate;

}
