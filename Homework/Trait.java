package Homework; 

public class Trait {
    public static void main(String[] args) {
        Peasant peasant = new Peasant(10, 7, 9, 4, 12);
        Archer archer = new Archer(20, 9, 12, 5, 14);
        Sniper sniper = new Sniper(30, 13, 013, 6, 5);
        Spearman spearman = new Spearman(40, 15, 10, 7, 78);
        Rogue rogue = new Rogue(50, 15, 16, 8, 44);
        Monk monk = new Monk(60, 17, 17, 9, 33);
        Mage mage = new Mage(70, 20, 20, 10, 44);

        peasant.attack();
        archer.attack();
        sniper.attack();
        spearman.attack();
        rogue.attack();
        monk.attack();
        mage.attack();

        peasant.takeDamage(5);
        archer.takeDamage(10);
        sniper.takeDamage(15);
        spearman.takeDamage(20);
        rogue.takeDamage(25);
        monk.takeDamage(30);
        mage.takeDamage(35);
    }
}