package com.shopmanagementsystem.spring.Controllers.Rest;

import com.shopmanagementsystem.spring.model.Database.User;
import com.shopmanagementsystem.spring.model.LoginSignUp.LoginService;
import com.shopmanagementsystem.spring.model.LoginSignUp.SignUp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
//    private List<User> users = new ArrayList<>();
//    @Autowired
//    private UserDAO userDAO;

//    @GetMapping("/Database/get-all")
//    public List<User> getAllUsers(){
//        return userDAO.getAllUsers();
//    }

    @PostMapping("/User/CreateUser")
    public boolean createUser(@RequestBody User user){
        System.out.println(user.toString());
        SignUp signUp = new SignUp();
        signUp.createUser(user.getName(),user.getPassword());
        //System.out.println(user);
        //userDAO.save(user);
        return true;
    }

    @GetMapping("/User/VerifyCreds")
    public boolean verifyCreds(@RequestBody User user){
        LoginService login = new LoginService();
        login.verifyCreds();
        return  true;
    }
}
