package pruebaeclipse;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
			int[] filas = {8, 7, 6, 5, 4, 3, 2, 1};
		    String[] columnas = {"a", "b", "c", "d", "e", "f", "g", "h"};

		    String[][] tablero = new String[8][8];
		    int i, j;
		    int filaInicial = 5;
		    int columnaInicial = 5;

		    for (i = 0; i < tablero.length; i++) {
		        for (j = 0; j < tablero[i].length; j++) {
		            if (i + j == filaInicial + columnaInicial || i - j == filaInicial - columnaInicial || i == filaInicial || j == columnaInicial) {
		                tablero[i][j] = "X";
		                System.out.print(columnas[j] + filas[i] + "  ");

		            } else {
		                tablero[i][j] = "-";

		            }

		        }

		    }
		    tablero[filaInicial][columnaInicial] = "O";


		    System.out.println(" ");

		    for (i = 0; i < tablero.length; i++) {
		        System.out.println(Arrays.toString(tablero[i]));
		    }
		}

		

	}