import valeria.util.Calculable;

public class Trapecio implements Calculable{
	private String name;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double bMenor;
	private double bMayor;
	private double altura;
	public Trapecio(String name, double lado1, double lado2, double lado3, double lado4, double bMenor, double bMayor,
			double altura) {
		super();
		this.name = name;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.bMenor = bMenor;
		this.bMayor = bMayor;
		this.altura = altura;
	}
	public double calcularArea() {
		return lado1+lado2+lado3+lado4;	
	}//calcularArea
	public double calcularPerimetro() {
		return ((bMenor+bMayor)*altura)/2;
	}// calcularPerimetro
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	public double getLado4() {
		return lado4;
	}
	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}
	public double getbMenor() {
		return bMenor;
	}
	public void setbMenor(double bMenor) {
		this.bMenor = bMenor;
	}
	public double getbMayor() {
		return bMayor;
	}
	public void setbMayor(double bMayor) {
		this.bMayor = bMayor;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4="
				+ lado4 + ", bMenor=" + bMenor + ", bMayor=" + bMayor + ", altura=" + altura + "]";
	}
	

	
	
}
