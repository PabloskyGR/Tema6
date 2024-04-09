package ejercicio04;

public class Television extends Electrodomestico {

	protected int resolucion;

	protected boolean sintonizadorTDT;

	public Television() {

		resolucion = 20;
		sintonizadorTDT = false;
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);

		resolucion = 20;
		sintonizadorTDT = false;
	}

	public Television(double precioBase, double peso, String color, char consumo, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, peso, color, consumo);

		if (resolucion > 0) {
			this.resolucion = resolucion;
		}

		this.sintonizadorTDT = sintonizadorTDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	@Override
	public double precioFinal() {
		double res = super.precioFinal();

		if (resolucion >= 40) {
			res += (res * 30) / 100;
		}
		if (sintonizadorTDT) {
			res += 50;
		}

		return res;
	}

}
