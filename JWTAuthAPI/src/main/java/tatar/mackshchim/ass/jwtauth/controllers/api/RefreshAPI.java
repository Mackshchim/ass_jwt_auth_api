package tatar.mackshchim.ass.jwtauth.controllers.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tatar.mackshchim.ass.jwtauth.DTO.AccessRefreshTokensDTO;

@RequestMapping("/api/auth/refresh")
public interface RefreshAPI {

    @GetMapping
    ResponseEntity<AccessRefreshTokensDTO> refresh(@RequestParam(name = "Authorization") String authorization);

}
