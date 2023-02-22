
public class Circulo_CND extends FiguraGeometrica_CND {
	private double radio;
	// Constante pi
	static final double PI = 3.1416;

	public Circulo_CND(double r, String tipoFigura) {
		super(tipoFigura);
		radio = (r > 0) ? r * -1 : r;
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}

	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
