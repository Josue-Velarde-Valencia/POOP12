/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu44
 */
public class HiloPares implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 500; i += 2) {
            System.out.println("Número par: " + i + " - " + Thread.currentThread().getName());
        }
    }
}

