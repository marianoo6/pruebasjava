package com.marianogfi.primerProyecto;

import java.util.Scanner;

public class ciclos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantos numeros quieres procesar?");
		int cantidad = entrada.nextInt();
		
		System.out.printf("Ingresa %d datos\n", cantidad);
//			for(int i = 1; i <= cantidad; i++) {
//				int num = entrada.nextInt();
//				int resultado = num * 2;
//				System.out.printf("Dato %d, procesado: %d\n", i, resultado);
//			}
			
			int c = 1;
			while(c <= cantidad) {
				System.out.printf("Dato %d: ", c);
				int num = entrada.nextInt();
				int resultado = num * 2;
				System.out.printf("dato %d procesado: %d\n", c, resultado);
				c++;
			}
	}

}
