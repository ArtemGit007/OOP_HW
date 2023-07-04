package Homework;

public class Archer extends Character {
    private int crossbowProficiency;
    private int health;
    private int agilityLevel;
    private int attackPower;

    public Archer(int attackPower, int defense, int health, int speed, int crossbowProficiency) {
        super(attackPower, defense, health, speed, crossbowProficiency);
        this.crossbowProficiency = crossbowProficiency;
        this.health = health;
    }

    public void attack() {
        System.out.println("Archer is attacking!");
    }

    public void takeDamage(int i) {
    }

    // Дополнительные методы и функциональность для Арбалетчика
    // ...
}
