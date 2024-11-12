package org.ipso.knowledgebase.controller;

import lombok.AllArgsConstructor;
import org.ipso.knowledgebase.dto.user.CreateUserModel;
import org.ipso.knowledgebase.entity.User;
import org.ipso.knowledgebase.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public User registerUser(CreateUserModel createUserModel){
        return userService.register(createUserModel);
    }
}
