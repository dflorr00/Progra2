package Codigo;

public class Casilla {
	
	//Atributos
	private char content;
	private int x;
	private int y;
	
	public Casilla() {
		content = '.';
	}
	
	public char getContent() {
		return content;
	}
	
	public int getY() {
		return x;
	}
	
	public int getX() {
		return y;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(content);
		return buffer.toString();
	}
}
