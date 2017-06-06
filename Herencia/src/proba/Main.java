package proba;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<FiguraXeometrica> obx1 = new ArrayList<>();
		
		Cuadrilatero c1 = new Cuadrilatero(3);
		Triangulo t1 = new Triangulo(6);
		
		obx1.add(c1);
		obx1.add(t1);
		
		FiguraXeometrica figura1 = obx1.get(0);
		FiguraXeometrica figura2 = obx1.get(1);
		
		figura1.getNumeroDeLados();
		
		figura1.getArea();
		
		figura2.getArea();
	}

}
