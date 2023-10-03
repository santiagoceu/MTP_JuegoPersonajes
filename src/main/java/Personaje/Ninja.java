package Personaje;

public class Ninja extends Personaje {
    String technique;

    public Ninja(String name, int strength, int speed, String weapon, String technique) {
        super(name, strength, speed, weapon);
        this.technique = technique;

    }

    public void special() {

        System.out.println(this.name + " uses: " + this.technique);

    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }
}
