package com.marianogfi.primerProyecto;

import java.util.Scanner;

public class condicionales {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculadora de Propinas");
		System.out.println("Ingresa la cantidad a pagar");
		double cantidad = entrada.nextDouble();
		System.out.println("Ingresa el % de propina");
		int porcentaje = entrada.nextInt();
		
		if (porcentaje <15) {
			System.out.println("El servicio no fue muy bueno");
			
		}else {
			System.out.println("Gran servicio");
		}
		
		double total = cantidad * porcentaje / 100;
		System.out.printf("El total es: %.1f", total);
	}
}
