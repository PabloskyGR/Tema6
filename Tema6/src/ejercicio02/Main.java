package ejercicio02;

public class Main {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado("papa");
		Empleado emp2 = new Directivo();
		Empleado emp3 = new Operario();
		Empleado emp4 = new Oficial();
		Empleado emp5 = new Tecnico();
		
		emp2.setNombre("pepe");
		emp3.setNombre("pepa");
		emp4.setNombre("pipa");
		emp5.setNombre("pepo");
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
		
		
	
		
		

	}

}
