package com.ljc.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication // 스프링부트의 자동설정, 스프링 Bean 읽기와 생성 모두 자동 설정
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // 내장 WAS 실행 : 스프링부트로 만들어진 Jar 파일 실행
    }
}
