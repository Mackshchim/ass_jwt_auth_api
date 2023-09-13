package tatar.mackshchim.ass.jwtauth.controllers.api;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import tatar.mackshchim.ass.jwtauth.DTO.AccessRefreshTokensDTO;
import tatar.mackshchim.ass.jwtauth.DTO.LoginForm;

public interface AuthorizationAPI {

    ResponseEntity<AccessRefreshTokensDTO> authorize(LoginForm form);


}
