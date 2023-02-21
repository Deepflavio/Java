
package com.mycompany.aps_unidade2;


public class Conta {
    //<atributo>
    
       protected double saldo;
    
    
    //<metodos>
    public void pegarSaldo(double valor){
        this.saldo -= valor;
        
       
    }
    public void depositar(double valor){
        this.saldo += valor;
        
    }        
    public void sacar(double valor){
        this.saldo -= saldo;
    }
    public void atualiza (double taxa){
        this.saldo += this.saldo*taxa;
        
    }
    public double getSaldo(){
        return this.saldo;
    }
            
}
