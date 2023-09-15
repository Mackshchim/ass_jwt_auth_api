package tatar.mackshchim.ass.jwtauth.controllers.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.http.ResponseEntity;
import tatar.mackshchim.ass.jwtauth.DTO.AccessRefreshTokensDTO;
import tatar.mackshchim.ass.jwtauth.DTO.ExceptionDTO;
import tatar.mackshchim.ass.jwtauth.DTO.LoginForm;

@Tags(
        @Tag(name = "Authorization")
)
public interface AuthorizationAPI {

    @Operation(summary = "Authorization using user's email and password")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Access and Refresh tokens", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = AccessRefreshTokensDTO.class))
            }),
            @ApiResponse(responseCode = "401", description = "Exception info", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDTO.class))
            })
    })
    ResponseEntity<AccessRefreshTokensDTO> authorize(LoginForm form);


}
