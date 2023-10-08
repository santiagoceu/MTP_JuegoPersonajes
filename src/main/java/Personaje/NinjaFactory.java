package Personaje;

public class NinjaFactory implements PersonajeFactory {

    public Personaje createPersonaje(String name, int strength, int speed, String weapon, String special) {

        return new Ninja(name,strength,speed,weapon,special);

    }

}
