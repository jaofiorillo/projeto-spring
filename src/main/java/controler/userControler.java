package controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import models.User;

@RestController
@RequestMapping("/user")
public class userControler {

   private List<User> users = new ArrayList<>();


@GetMapping("/")
public User user(){
   User user = new User();
   user.setId(1);
   user.setNome("joao");
   user.setUsuario("joao1");
return user;
}

@PostMapping("/")
public User user(@RequestBody User user){
   users.add(user);
   return user;
}

@GetMapping("/list")
public List <User> list(){
   return users;
}

}


