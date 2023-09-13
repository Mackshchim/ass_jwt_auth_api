package tatar.mackshchim.ass.jwtauth.DTO;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Access and Refresh tokens")
public record AccessRefreshTokensDTO(@Schema(description = "Access token") String accessToken,
                                     @Schema(description = "Refresh token") String refreshToken){}