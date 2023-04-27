import valeria.util.Calculable;

public class Rombo implements Calculable{
	private String name;
	private double lado;
	private double dMayor;
	private double dMenor;
	public Rombo(String name, double lado, double dMayor, double dMenor) {
		super();
		this.name = name;
		this.lado = lado;
		this.dMayor = dMayor;
		this.dMenor = dMenor;
	}
	
	public double calcularArea() {
		return (getdMenor() * getdMayor())/2;	
	}//calcularArea
	public double calcularPerimetro() {
		return (getLado() *4);
	}// calcularPerimetro
	
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
	public double getdMayor() {
		return dMayor;
	}
	public void setdMayor(double dMayor) {
		this.dMayor = dMayor;
	}
	public double getdMenor() {
		return dMenor;
	}
	public void setdMenor(double dMenor) {
		this.dMenor = dMenor;
	}
	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", dMayor=" + dMayor + ", dMenor=" + dMenor + "]";
	}


	
	

}


