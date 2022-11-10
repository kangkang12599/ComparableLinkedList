/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

import java.util.Comparator;

/**
 *
 * @author Chow Sing Hong
 */
public interface ListInterface <T extends Comparable<T>>{
    
    boolean add(T newElement);
    
    boolean add(int position, T newElement);
    
    T remove(int position);
    
    boolean remove(T element);
    
    int clear();
    
    T get(int position);
    
    int size();
    
    T contains(T element);
    
    boolean isEmpty();
    
    ListInterface getSortedList();
    
    ListInterface getSortedList(Comparator comparator);
    
    boolean merge(ListInterface<T> anotherList);
    
}
