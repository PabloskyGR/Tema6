package ejercicio05;

public class Triangulo extends Poligono {

	private int lado1;
	private int lado2;
	private int lado3;

	public Triangulo() {
		super(3);
	}

	public Triangulo(int lado1, int lado2, int lado3) {
		super(3);

		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	public double area() {
		double res = 0;
		double s;

		s = (this.lado1 + this.lado2 + this.lado3) / 2;

		res = Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));

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

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	@Override
	public String toString() {
		String res = "";

		res += super.toString() + "3\n";
		res += "Tipo: Triángulo\n";
		res += "Lado 1: " + this.lado1 + "\n";
		res += "lado 2: " + this.lado2 + "\n";
		res += "lado 3: " + this.lado3 + "\n";

		return res;

	}

}
