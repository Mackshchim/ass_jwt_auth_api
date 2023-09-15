package tatar.mackshchim.ass.jwtauth.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tatar.mackshchim.ass.jwtauth.DTO.AccessRefreshTokensDTO;
import tatar.mackshchim.ass.jwtauth.DTO.LoginForm;
import tatar.mackshchim.ass.jwtauth.controllers.api.AuthorizationAPI;
import tatar.mackshchim.ass.jwtauth.services.AuthorizationService;

@RequestMapping("/api/auth")
@RestController
@RequiredArgsConstructor
public class AuthorizationController implements AuthorizationAPI {

    private final AuthorizationService service;

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<AccessRefreshTokensDTO> authorize(LoginForm form) {
        System.out.println(form.getEmail());
        System.out.println(form.getPassword());
        return ResponseEntity.ok(service.authorize(form.getEmail(), form.getPassword()));
    }
}
