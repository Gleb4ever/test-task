package ru.chernyavskiy.test.task;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;

@OpenAPIDefinition(
        info = @Info(
                title = "Cinema application",
                version = "0.1",
                description = "Application for reserve seats in cinema",
                contact = @Contact(url = "https://github.com/gleb4ever", name = "Gleb Chernyavskiy", email = "cherglebas@mail.ru")
        )
)
public class CinemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemaApplication.class);
    }
}