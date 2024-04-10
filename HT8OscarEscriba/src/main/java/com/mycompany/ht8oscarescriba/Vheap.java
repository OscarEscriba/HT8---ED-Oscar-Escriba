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

public class Vheap<E extends Comparable<E>> extends PriorityQueue<E> implements PriorityQueues<E> {

    public Vheap() {
        super();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public E getFirst() {
        return super.peek();
    }

    @Override
    public E remove() {
        return super.remove();
    }

    @Override
    public void add(E value) {
          super.add(value);
    }

}