package ejercicio05;

public class Rectangulo extends Poligono {

	private int lado1;
	private int lado2;

	public Rectangulo() {
		super(4);
	}

	public Rectangulo(int lado1, int lado2) {
		super(4);

		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	public double area() {
		double res = 0;

		res = this.lado1 * this.lado2;

		return res;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	@Override
	public String toString() {
		String res = "";

		res += super.toString() + "4\n";
		res += "Tipo: Rectángulo\n";
		res += "Ancho: " + this.lado1 + "\n";
		res += "Largo: " + this.lado2 + "\n";
		res += "Área: " + area();

		return res;

	}

}
