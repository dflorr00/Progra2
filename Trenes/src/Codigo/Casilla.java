package Codigo;

public class Casilla{
	
	//Atributos
	public char content;
	public boolean eliminar;
	
	//Constructor
	public Casilla() {
		content = '.';
		eliminar = false;
	}
	
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(content);
		return buffer.toString();
	}
}