package tatar.mackshchim.ass.jwtauth.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tatar.mackshchim.ass.jwtauth.DTO.AccessRefreshTokensDTO;
import tatar.mackshchim.ass.jwtauth.exceptions.NotFoundException;
import tatar.mackshchim.ass.jwtauth.exceptions.AuthorizationException;
import tatar.mackshchim.ass.jwtauth.models.User;
import tatar.mackshchim.ass.jwtauth.repositories.UsersRepository;
import tatar.mackshchim.ass.jwtauth.services.AuthorizationService;
import tatar.mackshchim.ass.jwtauth.utils.JWTUtil;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorizationServiceImpl implements AuthorizationService {

    private final JWTUtil jwtUtil;

    private final UsersRepository repository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public AccessRefreshTokensDTO authorize(String email, String password) {
        Optional<User> opt = repository.findByEmail(email);
        if (opt.isPresent()) {
            User user = opt.get();
            System.out.println(passwordEncoder.encode(password));
            System.out.println(user.getHashPassword());
            if (passwordEncoder.matches(password, user.getHashPassword())) {
                return  jwtUtil.generateTokens(user);
            } else {
                throw new AuthorizationException("The password is incorrect for user with email " + email);
            }
        } else {
            throw new NotFoundException("User with email " + email + " not found");
        }
    }
}
