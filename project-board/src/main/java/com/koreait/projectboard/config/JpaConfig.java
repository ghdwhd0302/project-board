package com.koreait.projectboard.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@AutoConfiguration
public class JpaConfig {
    @Bean   // 데이터를 넣을 때 사용
    public AuditorAware<String> auditorAware(){
        return () -> Optional.of("관리자");    // 스프링 시큐리티로 인증 기능을 붙이게 될 때 수정할거임
    }

}
