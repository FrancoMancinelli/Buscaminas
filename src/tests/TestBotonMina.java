package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import pk_SuperBuscaMinas.BotonMina;
import pk_SuperBuscaMinas.BotonMina.Estado;
import pk_SuperBuscaMinas.MatrizBotones;

public class TestBotonMina {

	@Test
	public void cambiarAspectoTest() {
		
		BotonMina boton = new BotonMina(1, 1);
		BotonMina boton2 = new BotonMina(2,2);
		BotonMina boton3 = new BotonMina(3,3);
		BotonMina boton4 = new BotonMina(4,4);
		BotonMina boton5 = new BotonMina(5,5);
		
		Estado esperado = Estado.BANDERA;
		Estado resultado = boton.getEstado();
		
		System.out.println("*****Inicia prueba*****\n");
		
		System.out.println("Botón Inicial:  [Val=" + boton.getValor() + ", Est=" + boton.getEstado() + "]");
		boton.cambiarAspecto(Estado.BANDERA);
		System.out.println("Nuevo estado:   " + boton.getEstado());
		System.out.println("Botón Final:    [Val=" + boton.getValor() + ", Est=" + boton.getEstado() + "]\n");
	
		System.out.println("Botón Inicial:  [Val=" + boton2.getValor() + ", Est=" + boton2.getEstado() + "]");
		boton2.cambiarAspecto(Estado.BOTON);
		System.out.println("Nuevo estado:   " + boton2.getEstado());
		System.out.println("Botón Final:    [Val=" + boton2.getValor() + ", Est=" + boton2.getEstado() + "]\n");
		
		System.out.println("Botón Inicial:  [Val=" + boton3.getValor() + ", Est=" + boton3.getEstado() + "]");
		boton3.cambiarAspecto(Estado.PULSADO);
		System.out.println("Nuevo estado:   " + boton3.getEstado());
		System.out.println("Botón Final:    [Val=" + boton3.getValor() + ", Est=" + boton3.getEstado() + "]\n");
		
		System.out.println("Botón Inicial:  [Val=" + boton4.getValor() + ", Est=" + boton4.getEstado() + "]");
		boton4.cambiarAspecto(Estado.MINA);
		System.out.println("Nuevo estado:   " + boton4.getEstado());
		System.out.println("Botón Final:    [Val=" + boton4.getValor() + ", Est=" + boton4.getEstado() + "]\n");
		
		System.out.println("Botón Inicial:  [Val=" + boton5.getValor() + ", Est=" + boton5.getEstado() + "]");
		boton5.cambiarAspecto(Estado.NUMERO);
		System.out.println("Nuevo estado:   " + boton5.getEstado());
		System.out.println("Botón Final:    [Val=" + boton5.getValor() + ", Est=" + boton5.getEstado() + "]\n");
		
		System.out.println("*****Finalizar prueba*****");

	}

}
