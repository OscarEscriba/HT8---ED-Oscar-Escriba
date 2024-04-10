/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ht8oscarescriba;

/**
 *
 * @author Oscar Escriba
 */
public interface PriorityQueues<E extends Comparable<E>> {
    void add(E value);
    boolean isEmpty();
    int size();
    void clear();
    E getFirst();
    E remove();
}
