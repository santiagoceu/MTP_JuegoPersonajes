package Personaje;

public abstract class Personaje implements Cloneable {

    String name;
    int strength;
    int speed;
    String weapon;

    public Personaje(String name, int strength, int speed, String weapon) {

        this.name = name;
        this.strength = strength;
        this.speed = speed;
        this.weapon = weapon;

    }

    public void attack() {

        System.out.println(this.name + " attacks with: " + this.weapon);

    }
    public abstract void special();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int str) {
        this.strength = str;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int spd) {
        this.speed = spd;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}