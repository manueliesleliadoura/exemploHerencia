package proba;

public class Cuadrilatero extends FiguraXeometrica {



	public Cuadrilatero(int lado) {
		super(lado);
	}



	@Override
	public int getNumeroDeLados() {
		return 4;
	}



	@Override
	public int getArea() {
		return this.getLado()*this.getLado();
	}
}
