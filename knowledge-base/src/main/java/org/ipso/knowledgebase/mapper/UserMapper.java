package org.ipso.knowledgebase.mapper;

import org.ipso.knowledgebase.dto.user.CreateUserModel;
import org.ipso.knowledgebase.entity.User;

public class UserMapper {

    public static User toEntity(CreateUserModel createUserModel) {
        return User.builder()
                .firstname(createUserModel.getFirstname())
                .lastname(createUserModel.getLastname())
                .password(createUserModel.getPassword())
                .email(createUserModel.getEmail())
                .username(createUserModel.getUsername())
                .build();

    }
}
