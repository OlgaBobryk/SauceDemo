package testData;

import constants.Register;
import logindata.LogIn;

public class LoginData {
    public static LogIn getLoginWithUsername() {
        return LogIn
                .builder()
                .username(Register.USERNAME)
                .password(Register.PASSWORD)
                .build();
    }

    public static LogIn getLoginWithUsername1() {
        return LogIn
                .builder()
                .username(Register.USERNAME1)
                .password(Register.PASSWORD)
                .build();
    }

    public static LogIn getLoginWithUsername2() {
        return LogIn
                .builder()
                .username(Register.USERNAME2)
                .password(Register.PASSWORD)
                .build();
    }

    public static LogIn getLoginWithUsername3() {
        return LogIn
                .builder()
                .username(Register.USERNAME3)
                .password(Register.PASSWORD)
                .build();
    }
}

