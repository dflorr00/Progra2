package Codigo;

public class Casilla{
	
	//Atributos
	private char content;
	
	//Constructor
	public Casilla() {
		content = '.';
	}
	
	public char getContent() {
		return content;
	}
	
	public void setContent(char c) {
		this.content = c;
		
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(content);
		return buffer.toString();
	}
}