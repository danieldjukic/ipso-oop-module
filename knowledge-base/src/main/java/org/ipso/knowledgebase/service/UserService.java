package org.ipso.knowledgebase.service;

import lombok.AllArgsConstructor;
import org.ipso.knowledgebase.dto.user.CreateUserModel;
import org.ipso.knowledgebase.entity.User;
import org.ipso.knowledgebase.mapper.UserMapper;
import org.ipso.knowledgebase.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public User register(CreateUserModel createUserModel) {
        //TODO encrypt PW
        //TODO set role
        return userRepository.saveAndFlush(UserMapper.toEntity(createUserModel));
    }
}
