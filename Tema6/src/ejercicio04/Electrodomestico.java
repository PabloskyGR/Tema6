package ejercicio04;

public class Electrodomestico {

	protected enum Color {
		blanco, negro, rojo, azul, gris
	}

	protected enum Consumo {
		a, b, c, d, e, f
	}

	protected double precioBase;

	protected double peso;

	protected Color color;

	protected Consumo consumo;

	public Electrodomestico() {
		precioBase = 100;
		peso = 5;
		color = Color.blanco;
		consumo = Consumo.f;
	}

	public Electrodomestico(double precioBase, double peso) {
		color = Color.blanco;
		consumo = Consumo.f;

		if (precioBase > 0) {
			this.precioBase = precioBase;
		}

		if (peso > 0) {
			this.peso = peso;
		}
	}

	public Electrodomestico(double precioBase, double peso, String color, String consumo) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}

		if (peso > 0) {
			this.peso = peso;
		}
		if (color != null) {
			this.color = Color.valueOf(color);
		}
		if (consumo != null) {
			this.consumo = Consumo.valueOf(consumo);
		}
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public Color getColor() {
		return color;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public void comprobarConsumoEnergetico(char letra) {

		if (!(letra >= 'a' && letra <= 'f')) {
			consumo = Consumo.f;
		}

	}

	public void comprobarColor(String color) {

		if (!Color.values().equals(color)) {
			this.color = Color.blanco;
		}
	}

	public double precioFinal() {

		double res = precioBase;

		switch (consumo) {
		case a -> {
			res += 100;
		}
		case b -> {
			res += 80;
		}
		case c -> {
			res += 60;
		}
		case d -> {
			res += 50;
		}
		case e -> {
			res += 30;
		}
		case f -> {
			res += 10;
		}
		}

		if (peso <= 19 && peso >= 0) {
			res += 10;
		} else if (peso <= 49 && peso >= 20) {
			res += 50;
		} else if (peso <= 79 && peso >= 50) {
			res += 80;
		} else if (peso > 80) {
			res += 100;
		}

		return res;
	}

}
