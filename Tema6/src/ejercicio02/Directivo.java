package ejercicio02;

public class Directivo extends Empleado {

	public Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		String res = "";

		res = super.toString() + " --> " + "Directivo";

		return res;
	}

}
