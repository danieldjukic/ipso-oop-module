package org.ipso.knowledgebase.repository;

import org.ipso.knowledgebase.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
