package tatar.mackshchim.ass.jwtauth.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tatar.mackshchim.ass.jwtauth.DTO.AccessRefreshTokensDTO;
import tatar.mackshchim.ass.jwtauth.DTO.LoginForm;
import tatar.mackshchim.ass.jwtauth.controllers.api.AuthorizationAPI;


@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthorizationController implements AuthorizationAPI {

    private AuthenticationService service;

    public ResponseEntity<AccessRefreshTokensDTO> authorize(@RequestBody LoginForm form) {
        return service.authorize(form.email(), form.password());
    }
}
