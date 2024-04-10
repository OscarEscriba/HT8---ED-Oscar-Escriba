/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ht8oscarescriba;

/**
 *
 * @author Oscar Escriba
 */
import java.util.PriorityQueue;
/**
 * Implementación de una cola de prioridad utilizando PriorityQueue de Java Collection Framework.
 * @param <E> el tipo de elementos que se almacenan en la cola de prioridad.
 */
public class Vheap<E extends Comparable<E>> extends PriorityQueue<E> implements NewInterface<E> {
 /**
     * Constructor que inicializa un nuevo Vheap.
     */
  public Vheap(){
        super();
    }
  /**
     * Devuelve el primer elemento de la cola de prioridad sin eliminarlo.
     * @return el primer elemento de la cola de prioridad.
     */
    @Override
    public E getFirst() {
        return super.peek();
    }
    /**
     * Elimina y devuelve el primer elemento de la cola de prioridad.
     * @return el primer elemento de la cola de prioridad.
     */
    public E remove(){
        return super.remove();
    }
    // pre: !isEmpty()
    // post: returns and removes minimum value from queue
    /**
     * Añade un elemento a la cola de prioridad.
     * @param value el elemento a añadir.
     * @return true si el elemento se añade correctamente, false si no se pudo añadir.
     */
    @Override
    public boolean add(E value){
        return super.add(value);
    }
    // pre: value is non-null comparable
    // post: value is added to priority queue
     /**
     * Comprueba si la cola de prioridad está vacía.
     * @return true si la cola de prioridad está vacía, false de lo contrario.
     */
    public boolean isEmpty(){
        return super.isEmpty();
    }
    // post: returns true iff no elements are in queue
    /**
     * Devuelve el número de elementos en la cola de prioridad.
     * @return el número de elementos en la cola de prioridad.
     */
    public int size(){
        return super.size();
    }
    // post: returns number of elements within queue
     /**
     * Elimina todos los elementos de la cola de prioridad.
     */
    public void clear(){
        super.clear();
    }


}