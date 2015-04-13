/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.rainwhileloop.blogencapsulation.computer;

/**
 *
 * @author RainWhileLoop
 */
public class Harddisk {
    
    public void run(int round){
        System.out.println("Harddisk -> run : " + round + "rpm");
    }
    
    public void stop(){
        System.out.println("Harddisk -> stopped");
    }
    
}
