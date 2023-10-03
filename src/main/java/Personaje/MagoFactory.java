package Personaje;

public class MagoFactory implements PersonajeFactory {

    public Personaje createPersonaje(String name, int strength, int speed, String weapon, String special) {

        return new Mago(name,strength,speed,weapon,special);


    };

}
