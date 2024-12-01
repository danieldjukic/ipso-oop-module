package org.ipso.knowledgebase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.ipso.knowledgebase.enums.Role;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
