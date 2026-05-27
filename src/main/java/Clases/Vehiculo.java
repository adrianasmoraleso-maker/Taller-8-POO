package Clases;

// Clase base Vehiculo
public class Vehiculo {

    // Atributos protegidos accesibles por clases hijas
    protected String marca;
    protected int velocidadMaxima;

    // Constructor de la clase Vehiculo
    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para mostrar la información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}
