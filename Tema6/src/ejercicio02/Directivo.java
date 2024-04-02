package ejercicio02;

public class Directivo extends Empleado {

	public String toString() {
		String res = "";

		res = super.toString() + " --> " + "Directivo";

		return res;
	}

}
