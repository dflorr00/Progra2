package Codigo;

public class Tablero {
	
	private int tam = 30; //Tamaño del tablero 
	private String fila1 = "   0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 2 2\n";
	private String fila2 = "   0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9\n";
	private Casilla[][] tablero;
	
	//Constructor
	public Tablero() {
		tablero=new Casilla[tam][tam];
		for(int i=0;i<tam;i++) {
			for(int j=0;j<tam;j++) {
				tablero[i][j] = new Casilla();
			}
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
