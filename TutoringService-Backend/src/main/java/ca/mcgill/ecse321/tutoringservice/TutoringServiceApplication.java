package ca.mcgill.ecse321.tutoringservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Course Project for ECSE321 - Introduction to Software Engineering
 * This is a simple application for a tutoring service system on the view point of manager
 * This is the backend support of out tutor4all application, also, we have web application and Android app
 * @author Group 12 of ECSE321 2019F
 *
 */
@RestController
@SpringBootApplication
public class TutoringServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(TutoringServiceApplication.class, args);
  }

  @RequestMapping("/")
  public String greeting(){
    return "Hello world! ECSE 321!";
  }

}