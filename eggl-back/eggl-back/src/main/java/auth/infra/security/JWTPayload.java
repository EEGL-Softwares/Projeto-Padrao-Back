package auth.infra.security;

import auth.domain.user.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JWTPayload {
    private String login;
    private String Roles;
    private String idUser;

    public JWTPayload(User user) {
        setLogin(user.getLogin());
        setRoles(String.valueOf(user.getRole()));
        setIdUser(String.valueOf(user.getId()));
    }


}
