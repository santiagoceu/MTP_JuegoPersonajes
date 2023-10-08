package Personaje;

public class BestiaFactory implements PersonajeFactory {

    public Personaje createPersonaje(String name, int strength, int speed, String weapon, String special) {

        return new Bestia(name,strength,speed,weapon,special);

    }

}
