package ejercicio02;

public class Main {

	public static void main(String[] args) {

		Empleado emp1 = new Empleado("papa");
		Empleado emp2 = new Directivo("pepe");
		Empleado emp3 = new Operario("pepa");
		Empleado emp4 = new Oficial("pipa");
		Empleado emp5 = new Tecnico("pepo");

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);

	}

}
