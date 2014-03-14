/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reservatorio;

import ingredientes.Ingrediente;

/**
 *
 * @author Fabricio
 */
public class Reservatorio {
    
    private Ingrediente ingrediente;
    
    public boolean isEmpty(){
        System.err.println("Verificando estoque...");
        return true;        
    }
    
    public void liberandoDose(){
        System.err.println("Liberando ingrediente...");        
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
    
    
}
