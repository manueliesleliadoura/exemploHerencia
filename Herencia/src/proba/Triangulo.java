package proba;
public class Triangulo extends FiguraXeometrica{
	
	public Triangulo(int lado) {
		super(lado);
	}

	@Override
	public int getArea() {
		int base=0,altura=0;
		
		return base*altura;
	}

	@Override
	public int getNumeroDeLados() {
		return 3;
	}

}
