package ejercicio04;

public class Lavadora extends Electrodomestico {

	protected double carga;

	public Lavadora() {
		carga = 5;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		carga = 5;

	}

	public Lavadora(double precioBase, double peso, String color, char consumo, double carga) {
		super(precioBase, peso, color, consumo);
		if (carga > 0) {
			this.carga = carga;
		}

	}

	public double getCarga() {
		return carga;
	}

	@Override
	public double precioFinal() {
		double res = super.precioFinal();

		if (carga >= 30) {
			res += 50;
		}

		return res;
	}
	
	

}
