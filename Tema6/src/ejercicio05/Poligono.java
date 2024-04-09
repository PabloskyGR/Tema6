package ejercicio05;

public abstract class Poligono {

	protected int numeroLados;

	public Poligono(int numeroLados) {
		if (numeroLados > 2) {
			this.numeroLados = numeroLados;
		}

	}

	abstract double area();

	public int getNumeroLados() {
		return numeroLados;
	}

	@Override
	public String toString() {
		String res = "";

		res += "Nº Lados: " + this.numeroLados;

		return res;
	}

}
