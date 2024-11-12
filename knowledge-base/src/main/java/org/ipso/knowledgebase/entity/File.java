package org.ipso.knowledgebase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Getter
@Setter
public class File {

    @Id
    private Long id;

    private String fileName;

    private MultipartFile file;


}
