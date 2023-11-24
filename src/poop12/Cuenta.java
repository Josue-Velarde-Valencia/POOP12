/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo08alu44
 */
public class Cuenta extends Thread
{
  private static long saldo = 0;
  public Cuenta (String nombre)
  {
    super (nombre);
  }
  @Override
  public void run ()
  {
    if (getName ().equals ("Deposito 1") || getName ().equals ("Deposito 2"))
      {
	this.depositarDinero (100);
      }
    else
      {
	this.extraerDinero (50);
      }
    System.out.println ("Termina el " + getName ());
  }
  public synchronized void depositarDinero (int cantidad)
  {
    saldo += cantidad;
    System.out.println ("Se depositaron " + cantidad + " pesos");
    notifyAll ();
  }
  public synchronized void extraerDinero (int cantidad)
  {
    try
    {
      if (saldo <= 0)
	{
	  System.out.println (getName () + "espera Deposito" + "\nSaldo=" +
			      saldo);
	  sleep (5000);
	}
    }
    catch (InterruptedException e)
    {
      System.out.println (e);
    }
    saldo -= cantidad;
    System.out.println (getName () + " extrajo " + cantidad +
			"pesos. InSaldo restante=" + saldo);
    notifyAll ();
  }
  public static void main (String[]args)
  {
    new Cuenta ("Acceso 1").start ();
    new Cuenta ("Acceso 2").start ();
    new Cuenta ("Deposito 1").start ();
    new Cuenta ("Deposito 2").start ();
    System.out.println ("Termina el hilo principal");
  }
}