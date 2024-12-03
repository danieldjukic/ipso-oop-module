package org.ipso.knowledgebase.service;

import org.ipso.knowledgebase.dto.file.FileItemUploadDTO;
import org.ipso.knowledgebase.entity.File;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {
    public void saveFile(FileItemUploadDTO fileItemUploadDTO) {
        File file = new File();
        file.setFileName(fileItemUploadDTO.getFileName());
        file.setFile(fileItemUploadDTO.getFile());
    }
}
