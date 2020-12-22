package Codigo;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList <Tablero> entr = new ArrayList<Tablero>();
	private static char c;
	private static int l;
	private static int x;
	private static int y;
	
	public static void main(String[] args) {
		
		int count=0;
		//Entrada del programa
		do {
			entr.add(new Tablero());
			int n = sc.nextInt(); //Número de trenes
			for(int i=0;i<n;i++) {
				c = sc.next().charAt(0); //dirección
				l = sc.nextInt(); //Longitud
				x = sc.nextInt();
				y = sc.nextInt();
				entr.get(count).ocupar(c,l,x,y);
			}
			count++;
		}while(sc.hasNext());
		
		for(int j=0;j<count;j++) {
			entr.get(j).movimiento();
			System.out.println(entr.get(j).toString());
		}
	}
		
}

/*10
D 9 11 23
A 8 11 17
A 5 15 15
A 5 15 8
B 9 23 13
A 6 23 6
D 9 8 9
I 13 17 0
A 12 13 11
I 5 20 9*/