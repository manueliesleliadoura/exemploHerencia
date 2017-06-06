package proba;

public abstract class FiguraXeometrica {
	
	private int lado;
	
	public FiguraXeometrica(int lado){
		this.lado=lado;
	}

	public abstract int getArea();
	
	public int getPerimetro(){
		return lado*getNumeroDeLados();
	}
	
	public abstract int getNumeroDeLados();

	public int getLado() {
		return lado;
	}

	
	
	
}
