package logindata;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LogIn {
    private String username;
    private String password;

}
