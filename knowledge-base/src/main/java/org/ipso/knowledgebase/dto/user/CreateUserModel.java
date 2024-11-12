package org.ipso.knowledgebase.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserModel {
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
}
