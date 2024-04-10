/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ht8oscarescriba;

/**
 *
 * @author Oscar Escriba
 */
import java.util.Vector;
/**
 * Implementación de una cola de prioridad utilizando un montículo basado en un Vector.
 * @param <E> el tipo de elementos que se almacenan en la cola de prioridad.
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueues<E> {
 /** Los datos, mantienen el orden del montículo */
    protected Vector<E> data; // Los datos, mantienen el orden del montículo
    /**
     * Constructor que inicializa un nuevo VectorHeap.
     */
    public VectorHeap() {
        data = new Vector<>();
    }
    /**
     * Método que devuelve el índice del padre de un nodo dado.
     * @param i el índice del nodo.
     * @return el índice del padre del nodo.
     */
    protected static int parent(int i) {
        return (i - 1) / 2;
    }
      /**
     * Método que devuelve el índice del hijo izquierdo de un nodo dado.
     * @param i el índice del nodo.
     * @return el índice del hijo izquierdo del nodo.
     */
    protected static int left(int i) {
        return 2 * i + 1;
    }
    /**
     * Método que devuelve el índice del hijo derecho de un nodo dado.
     * @param i el índice del nodo.
     * @return el índice del hijo derecho del nodo.
     */
    protected static int right(int i) {
        return (2 * i + 1) + 1;
    }
    /**
     * Método que ajusta el montículo hacia arriba a partir de una hoja dada.
     * @param leaf el índice de la hoja.
     */
    protected void percolateUp(int leaf) {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 && (value.compareTo(data.get(parent)) < 0)) {
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf, value);
    }
     /**
     * Añade un elemento a la cola de prioridad.
     * @param value el elemento a añadir.
     */
    @Override
    public void add(E value) {
        data.add(value);
        percolateUp(data.size() - 1);
    }
    /**
     * Comprueba si la cola de prioridad está vacía.
     * @return true si la cola de prioridad está vacía, false de lo contrario.
     */
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }
    /**
     * Devuelve el tamaño de la cola de prioridad.
     * @return el tamaño de la cola de prioridad.
     */
    @Override
    public int size() {
        return data.size();
    }
    /**
     * Elimina todos los elementos de la cola de prioridad.
     */
    @Override
    public void clear() {
        data.clear();
    }
    /**
     * Ajusta el montículo hacia abajo a partir de la raíz dada.
     * @param root el índice de la raíz.
     */
    protected void pushDownRoot(int root) {
        int heapSize = data.size();
        E value = data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize) {
                if ((right(root) < heapSize) &&
                        ((data.get(childpos + 1)).compareTo(data.get(childpos)) < 0)) {
                    childpos++;
                }
                if ((data.get(childpos)).compareTo(value) < 0) {
                    data.set(root, data.get(childpos));
                    root = childpos;
                } else {
                    data.set(root, value);
                    return;
                }
            } else {
                data.set(root, value);
                return;
            }
        }
    }
    /**
     * Devuelve el primer elemento de la cola de prioridad sin eliminarlo.
     * @return el primer elemento de la cola de prioridad.
     */
    @Override
    public E getFirst() {
        return data.elementAt(0);
    }
    /**
     * Elimina y devuelve el primer elemento de la cola de prioridad.
     * @return el primer elemento de la cola de prioridad.
     */
    @Override
    public E remove() {
        E minVal = getFirst();
        data.set(0, data.get(data.size() - 1));
        data.setSize(data.size() - 1);
        if (data.size() > 1) {
            pushDownRoot(0);
        }
        return minVal;
    }
    /**
     * Devuelve una representación de cadena de la cola de prioridad.
     * @return una cadena que representa la cola de prioridad.
     */
    @Override
    public String toString() {
        return "VectorHeap{" + "data=" + data + '}';
    }
}
