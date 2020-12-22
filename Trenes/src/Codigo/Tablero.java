package Codigo;

public class Tablero {
	
	
	private String fila1 = "   0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 2 2\n";
	private String fila2 = "   0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9\n";
	private int tam = 30; //Tamaño del tablero 
	private boolean vacio;
	private Casilla[][] tablero;
	
	
	//Constructor con casillas vacías
	public Tablero() {
		vacio = true;
		tablero=new Casilla[tam][tam];
		for(int i=0;i<tam;i++) {
			for(int j=0;j<tam;j++) {
				tablero[i][j] = new Casilla();
			}
		}
	}
	
	//Cambia el contenido de la casilla por el caracter puesto
	public void ocupar(char c,int l,int x, int y) {
		switch(c) {
			case 'A': 
				for(int i=0;i<l;i++) {
					if((y-i)>=0) {
						tablero[y-i][x].content=c;
					}
				}
				break;
			case 'B':
				for(int i=0;i<l;i++) {
					if((y+i)<tam) {
						tablero[y+i][x].content=c;
					}
				}
				break;
			case 'I':
				for(int i=0;i<l;i++) {
					if(x+i<tam-1) {
						tablero[y][x+i].content=c;
					}
				}
				break;
			case 'D':
				for(int i=0;i<l;i++) {
					if((x-i)>=0) {
						tablero[y][x-i].content=c;
					}
				}
				break;
			default: System.out.println("No es una dirección válida");
		}	
	}

	//Mueve los trenes
	public void movimiento() {
		
		int n=0;
		while(n<100){
			
			for(int i=0;i<tam;i++) {
				for(int j=tam-1;j>=0;j--) {
					char c = tablero[i][j].content;
					switch(c) {
					case 'B':
						if(i<tam-1 && i>0) {
							if(tablero[i-1][j].content == '.')tablero[i-1][j].content='B';//avanza la cabeza
							else if(tablero[i-1][j].content!='B') tablero[i-1][j].content='X';//choque
							if(tablero[i+1][j].content != 'B')tablero[i][j].content = '.';//Si es el ultimo se elimina
						}else {
							tablero[i][j].content='.'; //es un borde y la elimina
						}
						break;
					case 'D':
						if(j<tam-1 && j>0) {
							if(tablero[i][j+1].content == '.')tablero[i][j+1].content='D';//avanza la cabeza
							else if(tablero[i][j+1].content!='D') tablero[i][j+1].content='X';//choque
							if(tablero[i][j-1].content != 'D')tablero[i][j].content = '.';//Si es el ultimo se elimina
						}else {
							tablero[i][j].content='.'; //es un borde y la elimina
						}break;
					}
				
				}
			}
			
			for(int i=tam-1;i>=0;i--) {
				for(int j=0;j<tam;j++) {
					char c = tablero[i][j].content;
					switch(c) {
					case 'A':
						if(i<tam-1 && i>0) {
							if(tablero[i+1][j].content == '.')tablero[i+1][j].content='A';//avanza la cabeza
							else if(tablero[i+1][j].content!='A') tablero[i+1][j].content='X';//choque
							if(tablero[i-1][j].content != 'A')tablero[i][j].content = '.';//Si es el ultimo se elimina
						}else {
							tablero[i][j].content='.'; //es un borde y la elimina
						}
						break;
					case 'I':
						if(j<tam-1 && j>0) {
							if(tablero[i][j-1].content == '.')tablero[i][j-1].content='I';//avanza la cabeza
							else if(tablero[i][j-1].content!='I') tablero[i][j-1].content='X';//choque
							if(tablero[i][j+1].content != 'I')tablero[i][j].content = '.';//Si es el ultimo se elimina
						}else {
							tablero[i][j].content='.'; //es un borde y la elimina
						}break;
					}
				
				}
			}
			
			n++;
		}
	}
	public void intercambia(Casilla a, Casilla v) {
		v.content = a.content;
	}
	
	public boolean vacio() {
		vacio = true;
		for(int i=0;i<tam;i++) {
			for(int j=0;j<tam;j++) {
				if(tablero[i][j].content!='.')vacio = false;
			}
		}
		return vacio;
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