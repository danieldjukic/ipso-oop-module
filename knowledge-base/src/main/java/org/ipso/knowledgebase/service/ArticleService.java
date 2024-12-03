package org.ipso.knowledgebase.service;

import lombok.AllArgsConstructor;
import org.ipso.knowledgebase.dto.article.ArticleRequestDTO;
import org.ipso.knowledgebase.entity.Article;
import org.ipso.knowledgebase.repository.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public void create(ArticleRequestDTO articleRequestDTO) {
        Article article = new Article();
        article.setTitle(articleRequestDTO.getTitle());
        article.setAssessment(articleRequestDTO.getAssessment());
        article.setCategory(articleRequestDTO.getCategory());
        articleRepository.save(article);
    }
}
