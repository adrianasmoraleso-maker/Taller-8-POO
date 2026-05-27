package Clases;

// Clase Coche que hereda de Vehiculo
public class Coche extends Vehiculo {

    // Atributo propio de la clase Coche
    private int numeroDePuertas;

    // Constructor de la clase Coche
    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {

        // Llama al constructor de la clase padre Vehiculo
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    // Sobrescritura del método mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}
