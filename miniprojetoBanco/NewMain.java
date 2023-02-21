
package com.mycompany.aps_unidade2;

public class NewMain {

   
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        c.depositar(1000);
        cc.deposita(1000);
        cp.depositar(1000);
        c.atualiza(0.02);
        cc.atualiza(0.02);
        cp.atualiza(0.02);
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
    
}
