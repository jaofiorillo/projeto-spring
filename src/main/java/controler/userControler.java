package controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import models.User;

@RestController
@RequestMapping("/user")
public class userControler {

private List<User> users = new ArrayList<>();

@GetMapping("/{id}")
public User user(@PathVariable("id") long id){
   User user = new User();

   user.setId(id);
   user.setNome("joao");
   user.setIdade(19);
   user.setSexo('M');
   user.setUsuario("joao123");
   user.setSenha("123456");

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


