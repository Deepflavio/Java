
package com.mycompany.aps_unidade2;


public class ContaPoupanca extends Conta {
    // <metodo atualiza>
  public void atualiza(double taxa){
      this.saldo += this.saldo *taxa * 3;
      
  }  
}
