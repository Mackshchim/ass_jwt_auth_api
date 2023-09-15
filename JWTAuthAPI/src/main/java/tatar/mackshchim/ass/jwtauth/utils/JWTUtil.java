package tatar.mackshchim.ass.jwtauth.utils;

import tatar.mackshchim.ass.jwtauth.DTO.AccessRefreshTokensDTO;
import tatar.mackshchim.ass.jwtauth.models.User;

public interface JWTUtil {

    AccessRefreshTokensDTO generateTokens(User user);

}
