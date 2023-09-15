package tatar.mackshchim.ass.jwtauth.utils.impl;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import tatar.mackshchim.ass.jwtauth.DTO.AccessRefreshTokensDTO;
import tatar.mackshchim.ass.jwtauth.models.User;
import tatar.mackshchim.ass.jwtauth.utils.JWTUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JWTUtilJJWTImpl implements JWTUtil {

    public static final Date ACCESS_TOKEN_EXPIRATION_TIME = new Date(5 * 60 * 1000);    //5 minutes
    public static final Date REFRESH_TOKEN_EXPIRATION_TIME = new Date(14 * 24 * 60 * 60 * 1000);    // 2 weeks
    public static final SignatureAlgorithm SIGNATURE_ALGORITHM = SignatureAlgorithm.HS512;
    @Value("${jwt.secret}")
    private String SECRET_KEY;


    @Override
    public AccessRefreshTokensDTO generateTokens(User user) {
        Map<String, String> claims = new HashMap<>();
        claims.put("sub", user.getEmail());

        JwtBuilder jwtBuilder = Jwts.builder();
        jwtBuilder.setExpiration(ACCESS_TOKEN_EXPIRATION_TIME);
        jwtBuilder.setClaims(claims);
        String accessToken = jwtBuilder.signWith(SIGNATURE_ALGORITHM, SECRET_KEY).compact();

        jwtBuilder.setExpiration(REFRESH_TOKEN_EXPIRATION_TIME);
        String refreshToken = jwtBuilder.signWith(SIGNATURE_ALGORITHM, SECRET_KEY).compact();

        return new AccessRefreshTokensDTO(accessToken, refreshToken);
    }
}
