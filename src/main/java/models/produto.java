package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class produto extends Vendedor {

    
long id_prod;
String nome_prod;
String classe;
float preço;
  
}
