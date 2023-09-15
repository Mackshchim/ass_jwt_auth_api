package tatar.mackshchim.ass.jwtauth.services;

import tatar.mackshchim.ass.jwtauth.DTO.AccessRefreshTokensDTO;

public interface AuthorizationService {
    AccessRefreshTokensDTO authorize(String email, String password);
}
