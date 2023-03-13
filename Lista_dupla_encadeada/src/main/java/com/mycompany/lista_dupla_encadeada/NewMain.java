
package com.mycompany.lista_dupla_encadeada;


public class NewMain {

   
    public static void main(String[] args) {
        Lista_dupla L = new Lista_dupla();
       System.out.println(L);
       
       for(int i =0;i<6;i++){
           L.insrirInicio(" "+(char) (i+97));
           System.out.println(L);
       }
        
    }
    
}
