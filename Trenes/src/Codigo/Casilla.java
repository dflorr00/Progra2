package Codigo;

public class Casilla{
	
	//Atributos
	public char content = '.';;
	
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(content);
		return buffer.toString();
	}
}