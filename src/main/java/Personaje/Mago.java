package Personaje;

public class Mago extends Personaje {

    String spell;

    @Override
    public void special() {

        System.out.println(this.name + " casts: " + this.spell);

    }

    public Mago(String name, int strength, int speed, String weapon, String spell) {
        super(name, strength, speed, weapon);
        this.spell = spell;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }
}
