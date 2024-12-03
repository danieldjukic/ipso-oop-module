package org.ipso.knowledgebase.controller;

import lombok.AllArgsConstructor;
import org.ipso.knowledgebase.dto.article.ArticleRequestDTO;
import org.ipso.knowledgebase.service.ArticleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/article")
@AllArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @PostMapping
    public void createArticle(ArticleRequestDTO articleRequestDTO) {
        articleService.create(articleRequestDTO);
    }
}
