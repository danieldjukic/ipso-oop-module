package org.ipso.knowledgebase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.ipso.knowledgebase.enums.Role;

@Entity
@Getter
@Setter
@Builder
public class User {

    @Id
    private Long id;

    private String username;

    private String firstname;

    private String lastname;

    private String password;

    private String email;

    private Role role;
}
