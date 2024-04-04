package ejercicio03;

public class Main {

	public static void main(String[] args) {

		Productos noPerecedero = new NoPerecedero("Fanta", 0.5, "refresco");
		Productos perecedero = new Perecedero("Pan", 0.25, 2);

		double precioFinal1 = noPerecedero.calcular(5);
		double precioFinal2 = perecedero.calcular(3);

		System.out.println(noPerecedero);
		System.out.println("Precio total: " + precioFinal1);

		System.out.println();
		System.out.println(perecedero);
		System.out.println("Precio total: " + precioFinal2);

		System.out.println(noPerecedero.getClass());
		System.out.println(perecedero.getClass());

		System.out.println(noPerecedero.getClass().getName());
		System.out.println(perecedero.getClass().getName());

		System.out.println(perecedero.getClass().getSuperclass());

	}
}
