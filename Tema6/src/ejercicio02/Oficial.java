package ejercicio02;

public class Oficial extends Operario {

	public String toString() {
		String res = "";

		res = super.toString() + "--> " + "Oficial";

		return res;
	}
}
