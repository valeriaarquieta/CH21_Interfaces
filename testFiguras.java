import valeria.util.Calculable;

public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c1=new Cuadrado("Cuadrado c1",10.5);
		Rectangulo r1=new Rectangulo("Rectángulo r1",3,7);
		Rombo rombo1=new Rombo("rombo1",20,40,19);
		Romboide romboide1=new Romboide("Romboide1",3,7);
		Trapecio tra1=new Trapecio("tra1",5,4,4,8,5,8,5);
		// TODO: Aquí se deben instanciar las otras figuras geométricas

		imprimirCalculo(t1); imprimirCalculo(t2);  imprimirCalculo(c1);
		imprimirCalculo(r1); imprimirCalculo(rombo1); imprimirCalculo(romboide1);
		imprimirCalculo(tra1);
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		
	}//main

	public static void imprimirCalculo(Calculable t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class testFiguras