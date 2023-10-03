package Personaje;

public class Bestia extends Personaje {

    String bestia;

    public Bestia(String name, int strength, int speed, String weapon, String bestia) {
        super(name, strength, speed, weapon);
        this.bestia = bestia;

    }

    public void special() {

        System.out.println(this.name + " transforms into: " + this.bestia);

    }

    public String getBestia() {
        return bestia;
    }

    public void setBestia(String bestia) {
        this.bestia = bestia;
    }
}
