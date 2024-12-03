package org.ipso.knowledgebase.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponseDTO {
    private String authenticationToken;
    private String username;
}
