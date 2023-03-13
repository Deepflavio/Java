
package com.mycompany.lista_dupla_encadeada;


public class Lista_dupla {
    No inicio;
    No  fim;
    int tamanho;
    public void insrirInicio(String info){
        No no = new No();
        no.anterior = null;
        no.info = info;
        no.proximo = inicio;
        if(inicio!= null){
           inicio.anterior = no; 
            
        }
        
        inicio = no;
        if(tamanho == 0){
            fim =inicio;
            
        }tamanho++;
    }
   public String retirarInicio(){
       if(inicio== null){
           return null;
           
       }
    
    String out = inicio.info;
    inicio = inicio.proximo;
    
       if(inicio!= null){
       inicio.anterior = null;  
     }else{
           fim = null;
       }tamanho--;
       
       return out;
   }
   public void inserirfim(String info ){
       No no = new No();
       no.info= info;
       no.proximo = null;
       no.anterior = fim;
       if(fim != null){
           fim.proximo = no;
           
       }fim = no;
       
       if(tamanho == 0){
           inicio = fim;
           
       }tamanho++;
       
   }
   public String retirarFim(){
       if(fim == null){
          return null; 
       }
    String out = fim.info;
    fim = fim.anterior;
    if(fim == null){
        fim.proximo = null;
        
    }else{
        inicio = null;
    }tamanho--;
    
    return out;
   }
   public void inserirMeio(int indice ,String info){
      if(indice <=0){
          insrirInicio(info);
          
      }else if( indice >= tamanho){
          inserirfim(info);
          
      }else{
          No local = inicio;
          for(int i=0; i< indice-1;i++){
              local = local.proximo;
              
          }
          No no = new No();
          no.info = info;
          no.anterior = local;
          no.proximo = local.proximo;
          local.proximo = no;
          no.proximo.anterior = no;
          
      } 
       
   }
   public String retirarMeio(int indice ){
       if(indice < 0
               || indice >= tamanho
               || inicio == null){
           return null;
           
       }else if(indice ==0){
           return retirarInicio();
       }else if( indice  == tamanho -1 ){
           return retirarFim();
       }
         No local = inicio;  
        for(int i =0; i< indice; i++){
            local = local.proximo;
        } 
        if(local.anterior != null){
           local.anterior.proximo = local.proximo; 
            
        }
        if(local.proximo != null){
           local.proximo.anterior = local.anterior; 
            
        } tamanho --;
       return  local.info;
   }
   public String toString(){
       String str = "(" + tamanho + ") ";
       No local = inicio;
       while(local != null){
           str += local.info + " ";
           local = local.proximo;
           
       }return str;
       
   }
   /*
   public static void Main(String[]ags[]){
       Lista_dupla L = new Lista_dupla();
       System.out.println(L);
       
       for(int i =0;i<6;i++){
           L.insrirInicio(" "+(char) (i+97));
           System.out.println(L);
       }
   } */

}
