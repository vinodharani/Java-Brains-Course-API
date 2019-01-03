package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//this annotation tells the spring boot that this is the starting point of our spring boot application
@SpringBootApplication
public class CourseApiApp {

    public static void main(String[] args) {
//        the below line calls a static method called 'run' in SpringApplication
//        the first argument is the class that is annotated with the @SpringBootApplication
//        the second argument is the argument passed to this method
//        this line creates the servlet container and starts it automatically
        SpringApplication.run(CourseApiApp.class, args);
    }
}
