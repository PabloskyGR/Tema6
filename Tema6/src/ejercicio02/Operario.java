package ejercicio02;

public class Operario extends Empleado {

	public String toString() {
		String res = "";

		res = super.toString() + " --> " + "Operario";

		return res;
	}
}
