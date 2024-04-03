package ejercicio03;

public class NoPerecedero extends Productos {

	private String tipo;

	public NoPerecedero() {

	}

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);

		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	public double calcular(int cantidad) {
		double res = 0;

		res = super.calcular(cantidad);

		return res;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	public String toString() {
		String res = "";

		res += super.toString() + "\n";
		res += "Tipo: " + "\n";

		return res;
	}
}
