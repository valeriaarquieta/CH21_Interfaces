import valeria.util.Calculable;

public class Cuadrado implements Calculable{
	private String name;
private double lado;

public Cuadrado (String name, double lado) {
	super();
	this.name = name;
	this.lado = lado;
}//constructor

public double calcularArea() {
	return (getLado() * getLado());	
}//calcularArea
public double calcularPerimetro() {
	return (getLado() *4);
}// calcularPerimetro

//get and set:

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getLado() {
	return lado;
}

public void setLado(double lado) {
	this.lado = lado;
}
//toString:

@Override
public String toString() {
	return "Cuadrado [name=" + name + ", lado=" + lado + "]";
}



}//class


