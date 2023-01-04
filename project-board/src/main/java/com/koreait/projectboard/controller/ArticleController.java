package com.koreait.projectboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("articles")
@Controller
public class ArticleController {

    @GetMapping
    public String articles(ModelMap map){   // 해당 map이 model로 작동
        map.addAttribute("articles", List.of()); // Vue에 속성 전달
        return "articles/index";
    }

    @GetMapping("/{articleId}")
    public String article(@PathVariable Long articleId, ModelMap map){
        map.addAttribute("article", "article");
        map.addAttribute("articleComments", List.of());
        return "articles/detail";
    }
}
