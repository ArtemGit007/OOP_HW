//Cоздание по одному экземпляру каждого класса

package Homework;

import Homework.Peasant;
import Homework.Archer;
import Homework.Sniper;
import Homework.Spearman;
import Homework.Rogue;
import Homework.Monk;
import Homework.Mage;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра класса Peasant
        Peasant peasant = new Peasant(10, 5, 100, 2, 3);

        // Создание экземпляра класса Archer
        Archer archer = new Archer(20, 8, 80, 5, 4);

        // Создание экземпляра класса Sniper
        Sniper sniper = new Sniper(30, 10, 70, 6, 5);

        // Создание экземпляра класса Spearman
        Spearman spearman = new Spearman(40, 12, 90, 4, 3);

        // Создание экземпляра класса Rogue
        Rogue rogue = new Rogue(50, 6, 110, 3, 4);

        // Создание экземпляра класса Monk
        Monk monk = new Monk(60, 7, 70, 3, 4);

        // Создание экземпляра класса Mage
        Mage mage = new Mage(70, 10, 80, 3, 5);

        // Ваши действия с созданными экземплярами классов...
        
 // Действия с Магом
System.out.println("Маг атакует:");
mage.attack();
System.out.println("Сила атаки мага: " + mage.getAttackPower());

System.out.println("Маг получает урон:");
mage.takeDamage(20);
System.out.println("Здоровье мага: " + mage.getHealth());

// Действия с Разбойником
System.out.println("Разбойник атакует:");
rogue.attack();
System.out.println("Сила атаки разбойника: " + rogue.getAttackPower());

System.out.println("Разбойник получает урон:");
rogue.takeDamage(15);
System.out.println("Здоровье разбойника: " + rogue.getHealth());
}
}

    

