package Clases;

public class PruebaEstudiante {

    public static void main(String[] args) {
     System.out.println("\n=== Estudiantes ===\n");
    Estudiante est = new Estudiante("Carlos López", 20, "MAT-2024-001");
        est.mostrarDetalles();

        System.out.println("\n");
        Estudiante est2 = new Estudiante("María Perez", 18, "MAT-2024-002");
        est2.mostrarDetalles();

        System.out.println("\n");
        Estudiante est3 = new Estudiante("José Romero", 23, "MAT-2024-003");
        est3.mostrarDetalles();
}
}
