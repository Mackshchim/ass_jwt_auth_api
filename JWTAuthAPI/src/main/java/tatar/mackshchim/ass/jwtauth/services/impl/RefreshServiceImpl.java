package tatar.mackshchim.ass.jwtauth.services.impl;

import org.springframework.stereotype.Service;
import tatar.mackshchim.ass.jwtauth.DTO.AccessRefreshTokensDTO;
import tatar.mackshchim.ass.jwtauth.services.RefreshService;

@Service
public class RefreshServiceImpl implements RefreshService {


    @Override
    public AccessRefreshTokensDTO refresh(String refreshToken) {
        //TODO: check if token is in blacklist

        return null;
    }

}
