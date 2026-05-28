package Clases;

public class PruebaEmpGer {

    public static void main(String[] args) {

    System.out.println("\n=== Empleado ===\n");
    Empleado emp = new Empleado("Laura Martínez", 2800000);
        emp.mostrarDetalles();

        System.out.println("\n");

        Empleado emp1 = new Empleado("José Mendoza", 3800000);
        emp1.mostrarDetalles();

        System.out.println("\n");

        Empleado emp2 = new Empleado("Monica Ramirez", 4000000);
        emp2.mostrarDetalles();

        System.out.println("\n=== Gerente ===\n");
    Gerente ger = new Gerente("Pedro Sánchez", 5000000, "Tecnología");
        ger.mostrarDetalles();
}
}