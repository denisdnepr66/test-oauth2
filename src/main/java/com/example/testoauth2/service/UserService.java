package com.example.testoauth2.service;

import java.util.Map;
import java.util.Optional;

import com.example.testoauth2.dto.LocalUser;
import com.example.testoauth2.dto.SignUpRequest;
import com.example.testoauth2.exception.UserAlreadyExistAuthenticationException;
import com.example.testoauth2.model.User;
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

public interface UserService {

    public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;

    User findUserByEmail(String email);

    Optional<User> findUserById(Long id);

    LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}