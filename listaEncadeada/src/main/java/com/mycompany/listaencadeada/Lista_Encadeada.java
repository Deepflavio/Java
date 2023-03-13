
package com.mycompany.listaencadeada;


public class Lista_Encadeada<T> {
    
    private no<T> inicio;
    
    public void adiciona(T elemento){
        no<T> celula = new no<T>(elemento);
        this.inicio = celula;
        
    } 
    public String toString(){
    StringBuilder builder = new StringBuilder();
    builder.append("no[elemento+").append(inicio).append("Proximo").append("]");
    return builder.toString();
}
}