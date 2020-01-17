package ru.lean.authorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthorizationServer {

  public static void maint(String[] args) {
    SpringApplication.run(AuthorizationServer.class, args);
  }
}
