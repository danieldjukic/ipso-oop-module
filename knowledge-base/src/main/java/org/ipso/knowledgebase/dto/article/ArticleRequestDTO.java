package org.ipso.knowledgebase.dto.article;

import lombok.Data;
import org.ipso.knowledgebase.entity.Assessment;
import org.ipso.knowledgebase.enums.Category;

import java.util.Set;

@Data
public class ArticleRequestDTO {
    private String title;
    private Set<Assessment> assessment;
    private Category category;
}
