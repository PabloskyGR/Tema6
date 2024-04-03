package ejercicio03;

public class Productos {

	protected String nombre;
	protected double precio;

	public Productos() {

	}

	public Productos(String nombre, double precio) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (precio >= 0) {
			this.precio = precio;
		}

	}

	public double calcular(int cantidad) {
		double res = 0;

		res = cantidad * this.precio;

		return res;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		}
	}

	@Override
	public String toString() {
		String res = "";

		res += "Nombre: " + this.nombre + "\n";
		res += "Precio: " + this.precio + "\n";

		return res;
	}

	public boolean equals(Object obj) {
		boolean iguales = false;

		Productos productoDiff = (Productos) obj;

		if (this.nombre.equals(productoDiff.nombre) && this.precio == productoDiff.precio) {
			iguales = true;
		}

		return iguales;
	}

	public double compareTo(Object obj) {
		double res = 0;

		Productos productoDiff = (Productos) obj;

		if (this.precio < productoDiff.precio) {
			res = -1;
		} else if (this.precio > productoDiff.precio) {
			res = 1;
		}

		return res;
	}

}
