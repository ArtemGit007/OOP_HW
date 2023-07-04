package Homework;

public class Mage extends Character {
    private int agilityLevel;
    private int health;
    private int attackPower;

    public Mage(int attackPower, int defense, int health, int speed, int agilityLevel) {
        super(attackPower, defense, health, speed, agilityLevel);
        this.agilityLevel = agilityLevel;
        this.health = health;
    }

    public void attack() {
        System.out.println("Маг атакует!");

    // Дополнительные методы и функциональность для Мага
    // ...
}

    public void takeDamage(int i) {
    }

	public String getAttackPower() {
		return null;
	}
}


