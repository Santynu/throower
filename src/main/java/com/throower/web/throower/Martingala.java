package com.throower.web.throower;

public class Martingala {

	// 36 + 0

	public static void main(String[] args) {

		double dineroJugador1 = 200;
		final double apuestaBase = 0.5;
		double apuestaActual = apuestaBase;
		boolean ganado = true;
		double apuestaMaxima = 0;
		
		for (int i = 0; i < 100000; i++) {
			
			if(dineroJugador1 >= 0) {
				
				int numeroRandom = (int) (Math.random() * 37);
				
				if(!ganado) {
					apuestaActual = apuestaActual * 2;
				} else {
					apuestaActual = apuestaBase;
				}
				
				if (numeroRandom == 0) {
					dineroJugador1 = dineroJugador1 - apuestaActual;
					ganado = false;
					System.out.println("Ronda: " + i + " se va apostar: " + apuestaActual +" sale: " + numeroRandom + " verde --> " + dineroJugador1);
				} else if (numeroRandom % 2 == 0) {
					dineroJugador1 = dineroJugador1 - apuestaActual;
					ganado = false;
					System.out.println("Ronda: " + i + " se va apostar: " + apuestaActual +" sale: " + numeroRandom + " par --> " + dineroJugador1);
				} else {
					dineroJugador1 = dineroJugador1 + apuestaActual;
					ganado = true;
					System.out.println("Ronda: " + i + " se va apostar: " + apuestaActual +" sale: " + numeroRandom + " impar --> " + dineroJugador1);
				}
				
			} else {
				System.out.println("HAS PERDIDO, A LA PUTA CALLE");
				break;
			}
			
			System.out.println();
			
			if(apuestaActual > apuestaMaxima) {
				apuestaMaxima = apuestaActual;
			}
			
		}
		System.out.println("Total: " + dineroJugador1 + ". Apuesta maxima realizada: " + apuestaMaxima);
	}

}
