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
		boolean salir=false;
		//Entrada del programa
		do {
			Tablero tb =new Tablero();
			int n = sc.nextInt(); //Número de trenes
			for(int i=0;i<n && !salir;i++) {
				c = sc.next().charAt(0); //dirección
				if(c != 'A' && c != 'B' && c != 'D' && c != 'I')salir = true;
				l = sc.nextInt(); //Longitud
				if(l>30 || l<1)salir = true;
				x = sc.nextInt();
				if(x>29 || x<0)salir = true;
				y = sc.nextInt();
				if(y>29 || y<0)salir = true;
				switch(c){
			    case 'A':if(y-(l-2)<0)salir = true;
			    case 'B':if(y+(l-2)>30)salir = true;
			    case 'D':if(x-(l-2)<0)salir = true;
			    case 'I':if(x+(l-2)>30)salir = true;
			}
				if(tb.ocupar(c,l,x,y)==true)salir = true;
			}
			if(!salir) {
				entr.add(tb);
				count ++;
			}
		}while(sc.hasNext() && !salir);
		
		//En caso de entrada erronea
		if(salir==true) {
			System.out.println("\n\nConjunto de trenes incorrecto.\n");
		}
		
		//Salida de todos los tableros buenos
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