package com.project.restapi;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class BaseTimeEntity {

    // 생성일
    @CreatedDate
    private LocalDateTime createdDate;

    // 수정일
    @LastModifiedDate
    private LocalDateTime modifiedDate;

}
