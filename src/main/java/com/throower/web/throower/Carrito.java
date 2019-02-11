package com.throower.web.throower;

public class Carrito {

	// 36 + 0

	public static void main(String[] args) {
		
		final double apuestaBase = 5;
		boolean ganado = true;
		double apuesta0 = 0;
		
		
		double dineroJugador1 = 200;
		double apuestaActual = apuestaBase;
		double apuestaMaxima = 0;

		
		double dineroJugador2 = 250;
		double apuestaMaxima2 = 0;
		double apuestaActual2 = apuestaActual;
		double multiplicadorJ2 = 3;
		
		final double total = dineroJugador1 + dineroJugador2;
		
		for (int i = 0; i < 10000; i++) {
			
			//if((dineroJugador1 >= 0 && dineroJugador2 >= 0) && (dineroJugador2 > (apuestaActual2 * multiplicadorJ2))) {
			if((dineroJugador1 >= 0 && dineroJugador2 >= 0) ) {
				
				int numeroRandom = (int) (Math.random() * 37);
				
				if(!ganado) {
					apuestaActual = apuestaActual * 2;
					apuesta0 = apuestaActual/20;
				} else {
					apuestaActual = apuestaBase;
					apuesta0 = 0;
				}
				
				
				//Jugador 1
				if (numeroRandom == 0) {
					dineroJugador1 = dineroJugador1 - apuestaActual;
					ganado = false;
					System.out.println("J1. Ronda: " + i + " se va apostar: " + apuestaActual +" sale: " + numeroRandom + " 0 --> " + dineroJugador1);
				} else if (numeroRandom % 2 == 0) {
					dineroJugador1 = dineroJugador1 - apuestaActual;
					ganado = false;
					System.out.println("J1. Ronda: " + i + " se va apostar: " + apuestaActual +" sale: " + numeroRandom + " par --> " + dineroJugador1);
				} else {
					dineroJugador1 = dineroJugador1 + apuestaActual;
					ganado = true;
					System.out.println("J1. Ronda: " + i + " se va apostar: " + apuestaActual +" sale: " + numeroRandom + " impar --> " + dineroJugador1);
				}
				
				//Juegador 2
				if(apuestaActual > apuestaBase) {
					
					apuestaActual2 = apuestaActual * multiplicadorJ2;
					
					if (numeroRandom == 0) {
						dineroJugador2 = dineroJugador2 - apuestaActual2;
						ganado = false;
						dineroJugador2 = dineroJugador2 + (apuesta0*35);
						System.out.println("J2. Ronda: " + i + " se va apostar: " + apuestaActual2 +" sale: " + numeroRandom + " 0 --> " + dineroJugador2);
					} else if (numeroRandom % 2 == 0) {
						dineroJugador2 = dineroJugador2 + apuestaActual2;
						ganado = true;
						dineroJugador2 = dineroJugador2 - apuesta0;
						System.out.println("J2. Ronda: " + i + " se va apostar: " + apuestaActual2 +" sale: " + numeroRandom + " par --> " + dineroJugador2);
					} else {
						dineroJugador2 = dineroJugador2 - apuestaActual2;
						ganado = false;
						dineroJugador2 = dineroJugador2 - apuesta0;
						System.out.println("J2. Ronda: " + i + " se va apostar: " + apuestaActual2 +" sale: " + numeroRandom + " impar --> " + dineroJugador2);
					}
				}
				
			System.out.println("Balance actual: " + ((dineroJugador1 + dineroJugador2) - total));	
			} else {
				System.out.println("J1: " + dineroJugador1);
				System.out.println("J2: " + dineroJugador2);
				
				if(dineroJugador1 + dineroJugador2 - total > 0){
					System.out.println("HAS GANANO, MUYAYO");
				} else {
					System.out.println("HAS PERDIDO, A LA PUTA CALLE");
				}
				
				break;
			}
			
			System.out.println();
			
			if(apuestaActual > apuestaMaxima) {
				apuestaMaxima = apuestaActual;
			}
			
			if(apuestaActual2 > apuestaMaxima2) {
				apuestaMaxima2 = apuestaActual2;
			}
			
		}
		
		System.out.println();
		System.out.println("Ganancia final: " + ((dineroJugador1 + dineroJugador2) - total));
		
		
		System.out.println("Total J1: " + dineroJugador1 + ". Apuesta maxima realizada: " + apuestaMaxima);
		System.out.println("Total J2: " + dineroJugador2 + ". Apuesta maxima realizada: " + apuestaMaxima2);
	}

}
