package Clases;

public class PruebaHerencia extends Vehiculo, Persona {



        // Ejercicio 4: Uso incorrecto de la herencia

        /*
        Java NO permite herencia múltiple entre clases.

        La siguiente declaración produciría un ERROR DE COMPILACIÓN
        porque una clase no puede extender más de una clase al mismo tiempo:

        class PruebaHerencia extends Vehiculo, Persona {}

        Esto ocurre para evitar problemas de ambigüedad conocidos como
        "Diamond Problem", donde dos clases padre podrían contener métodos
        con el mismo nombre y el compilador no sabría cuál utilizar.

        Java solamente permite herencia múltiple mediante interfaces.
        */


    }
