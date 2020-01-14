package ru.lean.articleService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ArticleService {

  public static void main(String[] args) {
    SpringApplication.run(ArticleService.class, args);
  }

}
