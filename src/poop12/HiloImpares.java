/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author DELL
 */
public class HiloImpares implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 500; i += 2) {
            System.out.println("Número impar: " + i + " - " + Thread.currentThread().getName());
        }
    }
}
