/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coletores;

import java.util.ArrayList;
import moedas.Moeda;


/**
 *
 * @author Fabricio
 */
public class ColetorMoeda extends Coletor{
    
    public ArrayList<Moeda> separarTroco(ArrayList<Moeda> moeda){
        System.err.println("Separando troco...");
        return moeda;
    }
    
    public void liberarTroco(){
        System.err.println("Liberando o troco...");        
    }
    
    public void depositar(ArrayList<Moeda> moeda){
        System.err.println("Depositando moeda...");        
    }

    @Override
    public void soma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float saldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cancelarOperacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
