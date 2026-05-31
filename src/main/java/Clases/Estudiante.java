package Clases;

public class Estudiante extends Persona {

    public void prueba() {

        System.out.println(nombre);
    }
}


    //private String matricula;

    //public Estudiante(String nombre, int edad, String matricula) {
    //    super(nombre, edad);
    //    this.matricula = matricula;
    }

    //@Override
    //public void mostrarDetalles() {
    //    super.mostrarDetalles();
    //    System.out.println("Matrícula: " + matricula);

//NOTA:
/*
No es posible acceder directamente a atributos private
de una clase padre desde una clase hija.
Este código produce un error de compilación porque los atributos private solo pueden
utilizarse dentro de la misma clase donde fueron declarados. Si se quisiera acceder a
estos atributos desde otra clase, deben de estar bien sea en public, o en protected,
(acceso con getters y setters)
*/