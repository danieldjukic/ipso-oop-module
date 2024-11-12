package org.ipso.knowledgebase.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Assessment {


    @Id
    private Long id;

   @ManyToOne
   private Article article;

   private String assessment;
}
