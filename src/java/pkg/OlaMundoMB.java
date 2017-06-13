package pkg;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

@Named(value = "CoffeeWithHook")
@Dependent
public class OlaMundoMB {
     StringBuilder texto = new StringBuilder();
    
    public OlaMundoMB() {
    }

    public StringBuilder getTexto() {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        
        texto.append("<br />")
             .append("Making Coffee...").append(coffeeWithHook.prepareRecipe())
            
        ;
        return texto;
    }

    // Não é necessário
    public void setTexto(StringBuilder texto) {
        this.texto = texto;
    }


}
