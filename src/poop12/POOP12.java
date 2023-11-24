/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu44
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Muestra de ejecución de hilos
        HiloT hilo1 = new HiloT("Primer Hilo");
        hilo1.start();
        new HiloT("Segundo Hilo").start();
        new Thread(new HiloR(), "Tercer Hilo").start();
        for(int i = 0; i < 10; i++) {
            System.out.println("Iteración " +i+ " del Main.");
        }
        System.out.println("Termina el Main.");
        
        //Hilo Ceros, Unos y Saltos de Línea
        new Thread(new HiloCeros(), "Hilo Ceros").start();
        new Thread(new HiloUnos(), "Hilo Unos").start();
        new Thread(new HiloSaltoDeLinea(), "Hilo Saltos De Línea").start();
        
        //Hilo Cuenta
        new Cuenta ("Acceso 1").start ();
        new Cuenta ("Acceso 2").start ();
        new Cuenta ("Deposito 1").start ();
        new Cuenta ("Deposito 2").start ();
        System.out.println ("Termina el hilo principal");
        
        
        System.out.println("##########Actividad Extra##########");
        new Thread(new HiloPares(), "Hilo Pares").start();
        new Thread(new HiloImpares(), "Hilo Impares").start();
    }
    
}
