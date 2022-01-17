package com.project.restapi.member.domain;

import com.project.restapi.member.dto.MemberRequestDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Builder
    public Member(MemberRequestDto memberSaveRequestDto) {
        name = memberSaveRequestDto.getName();
        email = memberSaveRequestDto.getEmail();
        password = memberSaveRequestDto.getPassword();
        role = Role.ROLE_USER;
    }

    // password bcrypt

}
