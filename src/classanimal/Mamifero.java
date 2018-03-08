/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classanimal;

/**
 *
 * @author Johanna Lloreda
 */
public class Mamifero extends Animal{
    
    private String sangrecaliente; /*boolean acepta dos respuesta de verdadero o falso**/
    
   public void parir (){ /*():void*/
        System.out.println("Cuantas Crías a Tenido");
} 
   public void amamantar (){ /*():void*/
        System.out.println("Cuantas Crias a Amamantado");
}

    public String getSangrecaliente() {
        return sangrecaliente;
    }

    public void setSangrecaliente(String sangrecaliente) {
        this.sangrecaliente = sangrecaliente;
    }

    
}
    
