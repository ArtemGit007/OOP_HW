package Homework;

public class Peasant extends Character {
    private int farmingSkill;
    private int health;
    private int attackPower;

    public Peasant(int attackPower, int defense, int health, int speed, int farmingSkill) {
        super(attackPower, defense, health, speed, farmingSkill);
        this.farmingSkill = farmingSkill;
    }

    public void attack() {
        System.out.println("Peasant is attacking!");
    }

    // Дополнительные методы и функциональность для Крестьянина
   

    public void useTool(String tool) {
        // Логика использования сельскохозяйственного инструмента
        System.out.println("Крестьянин использует инструмент: " + tool);
    }

    public void heal() {
        // Логика восстановления здоровья
        System.out.println("Крестьянин восстанавливает здоровье.");
    }

    public void defense() {
        // Логика защиты
        System.out.println("Крестьянин выполняет защитную действие.");
    }

    // Геттеры и сеттеры для характеристик
    // ...

    public static void main(String[] args) {
        // Пример использования класса Peasant
        Peasant peasant = new Peasant(10, 5, 100, 6, 7);

        peasant.useTool("Плуг");
        peasant.heal();
        peasant.defense();
    }

    public void takeDamage(int i) {
    }
}

