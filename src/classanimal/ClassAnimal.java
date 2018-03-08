/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classanimal;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Johanna Lloreda
 */
public class ClassAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal Obj = new Animal();
        Obj.setPeso((float)2.2);
        Obj.comer();
        
        System.err.println(Obj.getPeso());
        
        Oviparo Obj1 = new Oviparo ();
        Obj1.setPeso((float) 5.2);
        Obj1.comer();
        Obj1.ponerHuevos();
        
        System.err.println(Obj1.getPeso());
        
        Mamifero Obj2 = new Mamifero ();
        Obj2.setPeso((float)9.2);
        Obj2.comer();
        Obj2.amamantar();
        Obj2.parir();        
        System.err.println(Obj2.getPeso());
        
        Delfín Obj3 = new Delfín();
        Obj3.setPeso((float)5);
        Obj3.comer();
        Obj3.amamantar();
        Obj3.parir();        
        Obj3.nadar();    
        System.err.println(Obj3.getPeso());    
        
        Perro Obj4 = new Perro();
        Obj4.setPeso((float)2);
        Obj4.comer();
        Obj4.amamantar();
        Obj4.parir();        
        Obj4.ladrar();     
        System.err.println(Obj4.getPeso());    
                
    }
    
}
