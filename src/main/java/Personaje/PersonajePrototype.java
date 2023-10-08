package Personaje;

import java.util.HashMap;

public class PersonajePrototype {
    private HashMap<String,Personaje> personajes;

    public PersonajePrototype() {
        this.personajes = new HashMap<String,Personaje>();
    }

    public Personaje put(String name, Personaje personaje) {
        return personajes.put(name,personaje);
    }

    public Personaje remove(String name) {
        return personajes.remove(name);
    }

    public Personaje get(String name) throws CloneNotSupportedException {
        return (Personaje) personajes.get(name).clone();
    }

}
