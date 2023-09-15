package tatar.mackshchim.ass.jwtauth.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Info of form from request")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LoginForm {

    @Schema(description = "Signed up user's email")
    String email;
    @Schema(description = "Signed up user's password")
    String password;

}