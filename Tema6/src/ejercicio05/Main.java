package ejercicio05;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Poligono[] poligonos = new Poligono[10];
		int opcion;

		do {
			menu();
			System.out.print("Introduce una opción: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				poligonos = introducirTriangulo(poligonos);
				break;
			case 2:
				poligonos = introducirRectangulo(poligonos);
				break;
			case 3:
				mostrarContenido(poligonos);
				break;
			case 4:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción inválida. Por favor, introduce una opción válida.");
			}
		} while (opcion != 4);
	}

	public static void menu() {
		System.out.println();
		System.out.println("Menú");
		System.out.println("-------------------------      ");
		System.out.println("1. Introducir Triángulo.       ");
		System.out.println("2. Introducir Rectángulo.      ");
		System.out.println("3. Mostrar contenido del array.");
		System.out.println("4. Salir...                    ");
		System.out.println();
		
	}

	public static Poligono[] introducirTriangulo(Poligono[] poligonos) {

		System.out.println("Introducir datos para un triángulo:");
		System.out.print("Lado 1: ");
		int lado1 = sc.nextInt();
		System.out.print("Lado 2: ");
		int lado2 = sc.nextInt();
		System.out.print("Lado 3: ");

		int lado3 = sc.nextInt();

		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

		// Buscamos el primer espacio vacío en el array para almacenar el triángulo
		for (int i = 0; i < poligonos.length; i++) {
			if (poligonos[i] == null) {
				poligonos[i] = triangulo;
				break;
			}
		}

		return poligonos;
	}

	public static Poligono[] introducirRectangulo(Poligono[] poligonos) {

		System.out.println("Introducir datos para un rectángulo:");
		System.out.print("Lado 1: ");
		int lado1 = sc.nextInt();
		System.out.print("Lado 2: ");
		int lado2 = sc.nextInt();

		Rectangulo rectangulo = new Rectangulo(lado1, lado2);

		// Buscamos el primer espacio vacío en el array para almacenar el rectángulo
		for (int i = 0; i < poligonos.length; i++) {
			if (poligonos[i] == null) {
				poligonos[i] = rectangulo;
				break;
			}
		}

		return poligonos;
	}

	public static void mostrarContenido(Poligono[] poligonos) {
		System.out.println("Contenido del array:");
		for (int i = 0; i < poligonos.length; i++) {
			if (poligonos[i] != null) {
				System.out.println(poligonos[i]);
			}
		}
	}
}
