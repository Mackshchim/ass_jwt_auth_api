package tatar.mackshchim.ass.jwtauth.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import tatar.mackshchim.ass.jwtauth.DTO.AccessRefreshTokensDTO;
import tatar.mackshchim.ass.jwtauth.controllers.api.RefreshAPI;
import tatar.mackshchim.ass.jwtauth.services.RefreshService;
import tatar.mackshchim.ass.jwtauth.utils.AuthorizationHeaderUtil;

@RestController
@RequiredArgsConstructor
public class RefreshController implements RefreshAPI {

    private final AuthorizationHeaderUtil headerUtil;
    private final RefreshService service;

    @Override
    public ResponseEntity<AccessRefreshTokensDTO> refresh(String authorization) {
        String refreshToken = headerUtil.getToken(authorization);
        return ResponseEntity.ok(service.refresh(refreshToken));
    }
}
