package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args->{
           Student job =  new Student("Job", LocalDate.of(2000, Month.APRIL,5),"job@job.com");
            Student alex =  new Student("Alex", LocalDate.of(2004, Month.APRIL,2),"alex@gmail.com");
            repository.saveAll(List.of(job, alex));
        };
    }
}
