package com.marianogfi.primerProyecto;

public class variables {
	public static void main(String[] args) {
		int pizzas = 6;
		int personas = 3;
		int pizzasPorPersona = pizzas / personas;
		
		System.out.printf("si hay %d pizzas y %d personas, a cada uno le toca %d pizzas", pizzas, personas, pizzasPorPersona);
	}
}
