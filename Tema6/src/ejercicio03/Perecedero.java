package ejercicio03;

public class Perecedero extends Productos {

	private int diasCaducar;

	public Perecedero() {

	}

	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);

		if (diasCaducar > 0) {
			this.diasCaducar = diasCaducar;
		}

	}

	public double calcular(int cantidad) {
		double res = 0;

		res = cantidad * precio;

		if (diasCaducar == 1) {
			res /= 4;
		}
		if (diasCaducar == 2) {
			res /= 3;
		}
		if (diasCaducar == 3) {
			res /= 2;
		}

		return res;
	}

	public int getDiasCaducar() {
		return diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		if (diasCaducar >= 0) {
			this.diasCaducar = diasCaducar;
		}
	}

	public String toString() {
		String res = "";

		res += super.toString() + "\n";
		res += "Días a caducar: " + this.diasCaducar + "\n";

		return res;
	}

}
