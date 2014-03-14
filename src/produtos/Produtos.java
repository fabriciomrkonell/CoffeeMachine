/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produtos;

import ingredientes.Ingrediente;
import java.util.ArrayList;


/**
 *
 * @author Fabricio
 */
public class Produtos {
    
    private String nome;
    
    private float preco;
    
    private ArrayList<Ingrediente> ingrediente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public ArrayList<Ingrediente> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(ArrayList<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }
    
    
    
    
    
    
    
}
