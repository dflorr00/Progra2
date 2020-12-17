package Codigo;

import java.util.Scanner;

public class Main {
	
	private static Tablero tablero = new Tablero();
	private static Scanner sc = new Scanner(System.in);
	private static char c;
	private static int L;
	private static int X;
	private static int Y;
	
	public static void main(String[] args) {
		
		//Pintar el tablero vacio
		System.out.println(tablero.toString());
		
		//Entrada del programa
		int n = sc.nextInt(); //Número de trenes
		
		for(int i=0;i<n;i++) {
			c = sc.next().charAt(0);
			L = sc.nextInt();
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		
	}
	
	
}
