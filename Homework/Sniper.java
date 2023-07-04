package Homework;

public class Sniper extends Character {
    private int accuracyLevel;
    private int health;
    private int attackPower;

    public Sniper(int attackPower, int defense, int health, int speed, int accuracyLevel) {
        super(attackPower, defense, health, speed, accuracyLevel);
        this.accuracyLevel = accuracyLevel;
        this.health = health;
    }

    public void attack() {
        System.out.println("Снайпер атакует!");
    }

    public void takeDamage(int i) {
    }

    // Дополнительные методы и функциональность для Снайпера
    // ...
}

