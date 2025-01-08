package com.example.simple_todo_list.dto;

public interface OAuth2Response {

    // 제공자 (naver, google, ...)
    String getProvider();

    // 제공자가 발급해주는 아이디(번호)
    String getProviderId();

    // 이메일
    String getEmail();

    // 사용자 실명
    String getName();
}
