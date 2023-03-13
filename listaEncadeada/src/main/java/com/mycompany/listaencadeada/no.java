
package com.mycompany.listaencadeada;

public class no <T>{
private T elemento;
private no<T> proximo;


    public no(T elemento){
        this.elemento= elemento;
        this.proximo= null;
        
    }

    public no(T elemento,no<T> proximo){
        this.elemento = elemento;
        this.proximo= proximo;
    }
    /**
     * @return the elemento
     */
    public T getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the proximo
     */
    public no<T> getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(no<T> proximo) {
        this.proximo = proximo;
    }
public String toString(){
    StringBuilder builder = new StringBuilder();
    builder.append("no[elemento+").append(elemento).append("Proximo").append(proximo).append("]");
            return builder.toString();
           

}
}
        