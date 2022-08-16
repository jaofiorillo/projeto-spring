package controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import models.compra;

@RestController
@RequestMapping("/compra")
public class compraControler {

    private List<compra> compras = new ArrayList<>();

    @GetMapping("/")
    public compra Buy(){
        compra Compra = new compra();
        Compra.setId_compra(1);
        Compra.setId_prod(1);
        Compra.setId_vend(1);
        Compra.setId(1);
        Compra.setNome_prod("varal");
        Compra.setDescrição("varal de roupa");
        Compra.setPreço(200);
        return Buy(); 

    }
    
    @PostMapping("/desc")
    public compra Compra(@RequestBody compra Compra){
        compras.add(Compra);
        return Compra;
    }
    @PostMapping("/list")
    public List<compra> list(){
       return compras;
    }

}
