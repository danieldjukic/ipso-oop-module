package org.ipso.knowledgebase.repository;

import org.ipso.knowledgebase.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File,Long> {
}
