/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Usuario
 */
class lista {
    nodo inicio, ultimo;
    public lista(){
        inicio = ultimo = null;}
    public void add (int dato){
        nodo nuevoNodo = new nodo(dato);
        if (inicio == null){
            inicio = ultimo = nuevoNodo;
        }else{ ultimo.siguiente = nuevoNodo;
        ultimo = nuevoNodo;
        }
        
    }
    public void mostrar (){
        nodo temporal = inicio;
        if (temporal == null){
            System.out.println("lista vacia");
           
        } else {
            while (temporal != null){
                System.out.println(temporal.dato);
                temporal = temporal.siguiente;
            }
        }
    }
   
}
