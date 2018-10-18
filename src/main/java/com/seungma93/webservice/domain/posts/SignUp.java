package com.seungma93.webservice.domain.posts;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class SignUp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column
    private String id;

    @Column
    private String pw;

    @Column
    private String name;

    @Builder
    public SignUp(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
    }


}
