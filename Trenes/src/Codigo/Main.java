package Codigo;

import java.util.Scanner;

public class Main {
	
	private static Tablero tablero = new Tablero();
	private static Scanner sc = new Scanner(System.in);
	private static char c;
	private static int l;
	private static int x;
	private static int y;
	
	public static void main(String[] args) {
		
		//Pintar el tablero vacio
		System.out.println(tablero.toString());
		
		//Entrada del programa
		int n = sc.nextInt(); //Número de trenes
		
		for(int i=0;i<n;i++) {
			c = sc.next().charAt(0); //dirección
			l = sc.nextInt(); //Longitud
			x = sc.nextInt();
			y = sc.nextInt();
			tablero.ocupar(c,l,x,y);
		}
		
		System.out.println(tablero.toString());
		
	}
	
	
}
