package ejercicio03;

public class NoPerecedero extends Productos {

	private String tipo = "";

	public NoPerecedero() {
		super();
	}

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);

		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	@Override
	public String toString() {
		String res = "";

		res += super.toString() + "\n";
		res += "Tipo: " + this.tipo + "\n";

		return res;
	}
}
