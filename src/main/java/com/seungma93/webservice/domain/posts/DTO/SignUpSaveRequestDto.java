package com.seungma93.webservice.domain.posts.DTO;


import com.seungma93.webservice.domain.posts.SignUp;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SignUpSaveRequestDto {

    private String id;
    private String pw;
    private String name;

    @Builder
    public SignUpSaveRequestDto(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    public SignUp toEntity(){
        return SignUp.builder()
                .id(id)
                .pw(pw)
                .name(name)
                .build();

    }
}
