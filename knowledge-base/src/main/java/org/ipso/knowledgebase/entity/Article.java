package org.ipso.knowledgebase.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.ipso.knowledgebase.enums.Category;

import java.util.Set;

@Entity
@Getter
@Setter
public class Article {


    @Id
    private Long id;

    private String title;

    @OneToMany
    private Set<Assessment> assessment;

    private Category category;
}
