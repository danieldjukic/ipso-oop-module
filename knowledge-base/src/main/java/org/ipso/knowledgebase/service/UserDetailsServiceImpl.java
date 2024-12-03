package org.ipso.knowledgebase.service;

import lombok.RequiredArgsConstructor;
import org.ipso.knowledgebase.entity.User;
import org.ipso.knowledgebase.entity.UserPrincipal;
import org.ipso.knowledgebase.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOptional = userRepository.getUserByUsername(username);
        User user = userOptional.orElseThrow(() -> new UsernameNotFoundException("NotFound"));

        return UserPrincipal.create(user);
    }
}
