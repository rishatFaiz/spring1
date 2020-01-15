package ru.lean.articleService.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

  @GetMapping("/name")
  public String getControllerName() {
    return ArticleController.class.getName();
  }

}
