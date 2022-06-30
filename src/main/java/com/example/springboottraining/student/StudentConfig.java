package com.example.springboottraining.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student pablo = new Student(
                    "Pablo",
                    "pablo@mail.com",
                    LocalDate.of(1998, JULY, 31)
            );
            Student martha = new Student(
                    "Martha",
                    "martha@mail.com",
                    LocalDate.of(1998, FEBRUARY, 22)
            );
            repository.saveAll(
                    List.of(pablo,martha));
        };
    }
}
