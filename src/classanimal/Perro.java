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
public class Perro extends Mamifero {
    
    String colorPelo;
           

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    
   public void ladrar(){ /*():void*/
        System.out.println("Si es un perro Cuantas veces ladra en el día");
    }


    
}
