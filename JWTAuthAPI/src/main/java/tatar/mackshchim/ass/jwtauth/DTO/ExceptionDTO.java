package tatar.mackshchim.ass.jwtauth.DTO;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Exception info")
public record ExceptionDTO(@Schema(description = "Exception text", example = "User not found") String message,
                           @Schema(description = "Exception's HTTP-code", example = "404") int status) {
}
