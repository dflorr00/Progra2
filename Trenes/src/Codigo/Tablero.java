package Codigo;

public class Tablero {
	
	private int tam = 30; //Tamaño del tablero 
	private String fila1 = "   0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 2 2\n";
	private String fila2 = "   0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9\n";
	private Casilla[][] tablero;
	
	//Constructor con casillas vacías
	public Tablero() {
		tablero=new Casilla[tam][tam];
		for(int i=0;i<tam;i++) {
			for(int j=0;j<tam;j++) {
				tablero[i][j] = new Casilla();
			}
		}
	}
	
	//Cambia el contenido de la casilla por el caracter puesto
	public void ocupar(char c,int l,int x, int y) {
		tablero[y][x].setContent(c);
		switch(c) {
			case 'A': 
				for(int i=0;i<l;i++) {
					if((y+i)<tam)tablero[y+i][x].setContent(c);
				}
				break;
			case 'B':
				for(int i=0;i<l;i++) {
					if((y-i)>=0)tablero[y-i][x].setContent(c);
				}
				break;
			case 'I':
				for(int i=0;i<l;i++) {
					if((x-i)>=0)tablero[y][x-i].setContent(c);
				}
				break;
			case 'D':
				for(int i=0;i<l;i++) {
					if(x+i<tam-1)tablero[y][x+i].setContent(c);
				}
				break;
			default: System.out.println("No es una dirección válida");
		}		
	}
	
	//Pinta el tablero
	public String toString() {	
		StringBuffer buffer = new StringBuffer();
		buffer.append(fila1);
		buffer.append(fila2);
		for(int i=tam-1;i>=0;i--) {
			if(i<10)buffer.append(0);
			buffer.append(i);
			for(int j=0;j<tam;j++) {
				buffer.append(" ");
				buffer.append(tablero[i][j].toString());
				
			}
			buffer.append("\n");
		}
		return buffer.toString();	
	}
}
