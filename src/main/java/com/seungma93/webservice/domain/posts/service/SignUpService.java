package com.seungma93.webservice.domain.posts.service;

import com.seungma93.webservice.domain.posts.DTO.SignUpSaveRequestDto;
import com.seungma93.webservice.domain.posts.SignUpRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class SignUpService {

    private SignUpRepository signUpRepository;

    @Transactional
    public Long save(SignUpSaveRequestDto dto){

        return signUpRepository.save(dto.toEntity()).getNo();
    }
}
