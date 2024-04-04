package ejercicio04;

public class Main {

	public static void main(String[] args) {

		Electrodomestico[] electrodomesticos = new Electrodomestico[10];

		double precioBase;
		double precioFinal;
		double precioTotalElectrodomesticos = 0;
		double precioTotalLavadoras = 0;
		double precioTotalTelevisiones = 0;

		electrodomesticos[0] = new Electrodomestico(150, 10, "blanco", "a");
		electrodomesticos[1] = new Lavadora(200, 15, "negro", "b", 20);
		electrodomesticos[2] = new Television(300, 20, "rojo", "c", 50, true);
		electrodomesticos[3] = new Electrodomestico(180, 12);
		electrodomesticos[4] = new Lavadora(250, 18, "azul", "f", 25);
		electrodomesticos[5] = new Television(400, 25);
		electrodomesticos[6] = new Electrodomestico(160, 8, "gris", "d");
		electrodomesticos[7] = new Lavadora(220, 16);
		electrodomesticos[8] = new Television(350, 22, "blanco", "e", 45, false);
		electrodomesticos[9] = new Electrodomestico(170, 14);

		// Calculamos el precio final para cada electrodoméstico y mostramos el precio
		// base
		for (Electrodomestico electrodomestico : electrodomesticos) {
			precioBase = electrodomestico.getPrecioBase();
			precioFinal = electrodomestico.precioFinal();
			System.out.println("Precio base del electrodoméstico: " + precioBase);
			System.out.println("Precio final del electrodoméstico: " + precioFinal);
			System.out.println();
		}

		// Calculamos el precio de cada tipo de electrodomestico y mostramos el precio
		// total
		for (Electrodomestico electrodomestico : electrodomesticos) {
			if (electrodomestico instanceof Lavadora) {
				precioTotalLavadoras += electrodomestico.precioFinal();
			} else if (electrodomestico instanceof Television) {
				precioTotalTelevisiones += electrodomestico.precioFinal();
			}
			precioTotalElectrodomesticos += electrodomestico.precioFinal();
		}

		System.out.println("Precio total de Electrodomesticos: " + precioTotalElectrodomesticos);
		System.out.println("Precio total de Lavadoras: " + precioTotalLavadoras);
		System.out.println("Precio total de Televisiones: " + precioTotalTelevisiones);
	}
}
