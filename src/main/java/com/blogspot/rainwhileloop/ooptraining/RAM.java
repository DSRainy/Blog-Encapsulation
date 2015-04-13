/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.rainwhileloop.ooptraining;

/**
 *
 * @author RainWhileLoop
 */
public class RAM {
    
    public void allocate(int address){
        System.out.println("RAM -> Allocating : " + Integer.toHexString(address));
        System.out.println("Allocate -> Complete");
    }
    
    public void unallocate(int address){
        System.out.println("RAM -> Unallocating : " + Integer.toHexString(address));
        System.out.println("Unallocate -> Complete");
    }
}
