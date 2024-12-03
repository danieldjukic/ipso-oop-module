package org.ipso.knowledgebase.controller;

import lombok.AllArgsConstructor;
import org.ipso.knowledgebase.dto.file.FileItemUploadDTO;
import org.ipso.knowledgebase.service.FileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/file")
@AllArgsConstructor
public class FileController {

    private final FileService fileService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFileToS3(@ModelAttribute FileItemUploadDTO uploadDTO) {
        try {
            fileService.saveFile(uploadDTO);
            return ResponseEntity.ok("File uploaded successfully.");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
