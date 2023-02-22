
/**
 * @author Carmelo Nieto Domene
 *
 */
public class Rectangulo_CND extends FiguraGeometrica_CND {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de la clase que recibe los parámetros tipoFigura, lG y lP
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_CND(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Método que devuelve el resultado de calcular el área del triángulo
	 * @return double área
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Método que devuelve el resultado de calcular el perímetro del triángulo
	 * @return double perímetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
