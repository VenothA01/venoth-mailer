package com.dailycoder.venothmailer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class VenothMailerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VenothMailerApplication.class, args);
    }

    @Bean("mapper")
    public ObjectMapper mapper(){
        return new ObjectMapper();
    }

}
