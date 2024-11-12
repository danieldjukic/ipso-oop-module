package org.ipso.knowledgebase.repository;

import org.ipso.knowledgebase.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
