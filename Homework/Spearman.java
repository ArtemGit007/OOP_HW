package Homework;

public class Spearman extends Character {
    private int spearProficiency;
    private int health;
    private int attackPower;

    public Spearman(int attackPower, int defense, int health, int speed, int spearProficiency) {
        super(attackPower, defense, health, speed, spearProficiency);
        this.spearProficiency = spearProficiency;
        this.health = health;
        
    }

    public void attack() {
        System.out.println("Копьеносец атакует!");
    }

    public void takeDamage(int i) {
    }

    // Дополнительные методы и функциональность для Копейщика
    // ...
}
