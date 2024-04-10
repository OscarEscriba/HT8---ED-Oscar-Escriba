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

public class Vheap<E extends Comparable<E>> extends PriorityQueue<E> implements NewInterface<E> {

  public Vheap(){
        super();
    }

    @Override
    public E getFirst() {
        return super.peek();
    }

    public E remove(){
        return super.remove();
    }
    // pre: !isEmpty()
    // post: returns and removes minimum value from queue

    @Override
    public boolean add(E value){
        return super.add(value);
    }
    // pre: value is non-null comparable
    // post: value is added to priority queue

    public boolean isEmpty(){
        return super.isEmpty();
    }
    // post: returns true iff no elements are in queue

    public int size(){
        return super.size();
    }
    // post: returns number of elements within queue

    public void clear(){
        super.clear();
    }


}