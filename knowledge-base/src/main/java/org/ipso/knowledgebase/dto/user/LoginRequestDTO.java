package org.ipso.knowledgebase.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class LoginRequestDTO {

    @NotNull
    @NotBlank
    private String username;

    @NotNull
    @NotBlank
    private String password;
}