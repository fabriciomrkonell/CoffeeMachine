/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package display;

import produtos.Produtos;

/**
 *
 * @author Fabricio
 */
public class Display {
    
    private float saldo(float saldo){
        System.err.println("Retornando valor...");
        return saldo;
    }

    private void preco(Produtos produto){
        System.err.println("Imprimindo o preço...");        
    }
    
    private float troco(float troco){
        System.err.println("Retornando troco...");
        return troco;
    }
    
    private void produtoIndisponivel(Produtos produto){
        System.err.println("Produto indisponível...");        
    }
    
    private float semTroco(float troco){
        System.err.println("Sem troco...");
        return troco;
    }
    
    private void saldoInsuficiente(Produtos produto){
        System.err.println("Saldo insuficiente...");        
    }
    
    private void retirarProduto(){
        System.err.println("Retire seu produto...");        
    }
}
