package tatar.mackshchim.ass.jwtauth.services;

import tatar.mackshchim.ass.jwtauth.DTO.AccessRefreshTokensDTO;

public interface RefreshService {

    AccessRefreshTokensDTO refresh(String refreshToken);

}
