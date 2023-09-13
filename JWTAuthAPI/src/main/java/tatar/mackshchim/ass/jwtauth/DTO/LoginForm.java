package tatar.mackshchim.ass.jwtauth.DTO;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Info of form from request")
public record LoginForm(@Schema(description = "Signed up user's email") String email,
                        @Schema(description = "Signed up user's password") String password) { }
