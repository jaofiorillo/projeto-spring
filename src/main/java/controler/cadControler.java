package controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;
import models.produto;

@RestController
@RequestMapping("/cadastro")
public class cadControler {



    private List<produto> oii = new ArrayList<>();

   @GetMapping("/prod")
   public produto prod(){
    produto prod = new produto();

    prod.setId_prod(1);
    prod.setNome_prod("chocolate");
    prod.setClasse("comida");
    prod.setNome("joão");
    return prod;
   }

   @PostMapping("/")
    public produto prod(@RequestBody produto prod){
    oii.add(prod);
    return prod;
   }

   @PostMapping("/list")
   public List <produto> list(){
    return oii;
   }
    
   }

    

