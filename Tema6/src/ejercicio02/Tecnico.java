package ejercicio02;

public class Tecnico extends Operario {

	public String toString() {
		String res = "";

		res = super.toString() + "--> " + "Técnico";

		return res;
	}

}
