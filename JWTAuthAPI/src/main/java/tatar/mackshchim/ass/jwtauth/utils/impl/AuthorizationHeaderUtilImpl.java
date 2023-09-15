package tatar.mackshchim.ass.jwtauth.utils.impl;

import org.springframework.stereotype.Component;
import tatar.mackshchim.ass.jwtauth.utils.AuthorizationHeaderUtil;

@Component
public class AuthorizationHeaderUtilImpl implements AuthorizationHeaderUtil {

    private static final String BEARER = "Bearer ";

    @Override
    public String getToken(String authorization) {
        return authorization.substring(BEARER.length());
    }
}
