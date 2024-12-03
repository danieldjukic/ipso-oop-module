package org.ipso.knowledgebase.dto.file;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class FileItemUploadDTO {
    private String fileName;
    private MultipartFile file;
}
