package com.manneron.manneron.user.entity;

import com.manneron.manneron.common.util.TimeStamped;
import com.manneron.manneron.user.dto.SignupReqDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity(name = "users")
@Getter
@NoArgsConstructor
public class User extends TimeStamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String job;

    @Column(nullable = false)
    private String ageRange;

    @Column(nullable = true)
    private Long kakaoId;

    public User (String password, SignupReqDto signupReqDto){
        this.email = signupReqDto.getEmail();
        this.password = password;
        this.nickname = signupReqDto.getNickname();
        this.gender = signupReqDto.getGender();
        this.job = signupReqDto.getJob();
        this.ageRange = signupReqDto.getAgeRange();
    }
}

