package com.seungma93.webservice.domain.posts.controller;

import com.seungma93.webservice.domain.posts.DTO.SignUpSaveRequestDto;
import com.seungma93.webservice.domain.posts.PostsRepository;
import com.seungma93.webservice.domain.posts.DTO.PostsSaveRequestDto;
import com.seungma93.webservice.domain.posts.service.PostsService;
import com.seungma93.webservice.domain.posts.service.SignUpService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class WebRestController {

    private PostsRepository postsRepository;
    private PostsService postsService;
    private SignUpService signUpService;

    @GetMapping("/hello")
    public String hello()
    {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
            return postsService.save(dto);
    }

    @PostMapping("/signup")
    public Long saveSignUp(@RequestBody SignUpSaveRequestDto dto){ return signUpService.save(dto);}

}