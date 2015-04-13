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
public class Computer {

    private RAM ram;
    private CPU cpu;
    private Harddisk harddisk;

    public Computer() {
        this.harddisk = new Harddisk();
        this.cpu = new CPU();
        this.ram = new RAM();
    }

    public void start() {
        System.out.println("Computer -> starting...");
        this.cpu.process();
        this.harddisk.run(5400);
        this.ram.allocate(1);
    }

    public void shutdown() {
        System.out.println("Computer -> shutdown...");
    }
}
