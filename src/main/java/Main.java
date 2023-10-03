/*
Se desea incorporar a un juego una facilidad para crear nuevos personajes que se añaden al conjunto de personajes predefinidos.
En el juego, todos los personajes serán instancias de un pequeño conjunto de clases tales como Héroe, Villano....
Cada clase tiene una serie de atributos como nombre, peso, inteligencia, etc. y según sus valores,
una instancia de la clase representa a un personaje u otro.
Diseña una solución basada en patrones que permita al usuario crear nuevos personajes y seleccionar para cada sesión
del juego personajes de una colección de personajes creados. Entregable: UML explicado + código
*/

import Personaje.Mago;
import Personaje.MagoFactory;

public class Main {
    public static void main(String[] args) {
        MagoFactory magofactory = new MagoFactory();
        Mago mago = (Mago) magofactory.createPersonaje("Pepe",10,10,"daguita","Espeliarmus");

        mago.special();
        mago.attack();
    }

}