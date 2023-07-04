package Homework;

public class Character 
{
    private static int attackPower;
    private int defense;
    private int health;
    private int speed;

    public Character(int attackPower, int defense, int health, int speed, int magicResistance) {
        this.attackPower = attackPower;
        this.defense = defense;
        this.health = health;
        this.speed = speed;
    }
    
    public Character(int health2, int attackPower2, int mana, int armor, int defense2, int speed2,
            int magicResistance) {
    }

    public Character(int health2, int attackPower2, int magicResistance) {
    }

    // public static int getAttackPower() {
    //     return attackPower;
    // }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

	public int getAttackPower() {
		return attackPower;
	}

}
