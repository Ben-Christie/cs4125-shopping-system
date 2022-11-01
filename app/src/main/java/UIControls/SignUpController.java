package UIControls;

import Model.Login.SignUpService;

public class SignUpController {
    SignUpService signUpService = new SignUpService();

    public boolean verify(String username, String password, String confirmPassword) {
        return signUpService.emailNotInDb(username) &&
                signUpService.comparePasswords(password, confirmPassword);
    }
}
