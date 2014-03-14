/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coletores;

import display.Display;



/**
 *
 * @author Fabricio
 */
public abstract class Coletor extends Display{
    
    public abstract void soma();
    
    public abstract float saldo();
    
    public abstract void cancelarOperacao();
    
}
