/*
Se desea incorporar a un juego una facilidad para crear nuevos personajes que se añaden al conjunto de personajes predefinidos.
En el juego, todos los personajes serán instancias de un pequeño conjunto de clases tales como Héroe, Villano....
Cada clase tiene una serie de atributos como nombre, peso, inteligencia, etc. y según sus valores,
una instancia de la clase representa a un personaje u otro.
Diseña una solución basada en patrones que permita al usuario crear nuevos personajes y seleccionar para cada sesión
del juego personajes de una colección de personajes creados. Entregable: UML explicado + código
*/

import Personaje.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        MagoFactory magofactory = new MagoFactory();
        BestiaFactory bestiafactory = new BestiaFactory();
        NinjaFactory ninjafactory = new NinjaFactory();

        Mago mago = (Mago) magofactory.createPersonaje("Pepe",10,10,"daguita","Espeliarmus");

        mago.special();
        mago.attack();

        Bestia bestia = (Bestia) bestiafactory.createPersonaje("Mario",20,20,"Palo","Oso");

        bestia.special();
        bestia.attack();

        Ninja ninja = (Ninja) ninjafactory.createPersonaje("Lucas",15,50,"Shuriken","Explosivo");

        ninja.special();
        ninja.attack();

        PersonajePrototype personajes = new PersonajePrototype();
        personajes.put("Pepe",mago);
        personajes.put("Mario",bestia);
        personajes.put("Lucas",ninja);

        Mago pepe = (Mago) personajes.get("Pepe");

        System.out.println(pepe.equals(mago));

    }

}