package com.koreait.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeRequests(auth -> auth.anyRequest().permitAll())   // 로그인을 안해도 접근 가능하게 설정
                .formLogin().and()  // 로그인 페이지는 살려놓겠다
                .build();   // 설정된 값을 가지고 실행
    }

}
