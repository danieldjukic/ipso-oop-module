package org.ipso.knowledgebase.service;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.ipso.knowledgebase.dto.user.AuthenticationResponseDTO;
import org.ipso.knowledgebase.dto.user.CreateUserModel;
import org.ipso.knowledgebase.dto.user.LoginRequestDTO;
import org.ipso.knowledgebase.entity.User;
import org.ipso.knowledgebase.jwt.JwtProvider;
import org.ipso.knowledgebase.mapper.UserMapper;
import org.ipso.knowledgebase.repository.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;
    private final UserDetailsServiceImpl userDetailsService;
    private final JwtProvider jwtProvider;

    public User register(CreateUserModel createUserModel) {
        //TODO encrypt PW
        //TODO set role
        return userRepository.saveAndFlush(UserMapper.toEntity(createUserModel));
    }


    public AuthenticationResponseDTO login(@NonNull LoginRequestDTO loginRequestDTO){
        Authentication authentication;
        try {
            authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequestDTO.getUsername(), loginRequestDTO.getPassword()));
        }
        catch (BadCredentialsException e){
            throw new RuntimeException(e.getMessage());
        }
        catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        SecurityContextHolder.getContext().setAuthentication(authentication);
        final UserDetails userDetails = userDetailsService.loadUserByUsername(loginRequestDTO.getUsername());
        String token = jwtProvider.generateToken(userDetails);

        return new AuthenticationResponseDTO(token, userDetails.getUsername());
    }
}
