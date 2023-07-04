// Создание иерархии класов по увеличению силы атаки, сначала 

package Homework;

// public class Hierarchy {
//     public static void main(String[] args) {
//         Peasant peasant = new Peasant(10, 0, 0, 0, 0);
//         Archer archer = new Archer(20, 0, 0, 0, 0);
//         Sniper sniper = new Sniper(30, 0, 0, 0, 0);
//         Spearman spearman = new Spearman(40, 0, 0, 0, 0);
//         Rogue rogue = new Rogue(50, 0, 0, 0, 0);
//         Monk monk = new Monk(60, 0, 0, 0, 0);
//         Mage mage = new Mage(70, 0, 0, 0, 0);

//         // Пример использования созданных экземпляров
//         peasant.attack();
//         archer.attack();
//         sniper.attack();
//         spearman.attack();
//         rogue.attack();
//         monk.attack();
//         mage.attack();
//     }
// }



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hierarchy {
    public static void main(String[] args) {
        Peasant peasant = new Peasant(10, 0, 0, 0, 0);
        Archer archer = new Archer(20, 0, 0, 0, 0);
        Sniper sniper = new Sniper(30, 0, 0, 0, 0);
        Spearman spearman = new Spearman(40, 0, 0, 0, 0);
        Rogue rogue = new Rogue(50, 0, 0, 0, 0);
        Monk monk = new Monk(60, 0, 0, 0, 0);
        Mage mage = new Mage(70, 0, 0, 0, 0);

        List<Character> characters = new ArrayList<>();
        characters.add(peasant);
        characters.add(archer);
        characters.add(sniper);
        characters.add(spearman);
        characters.add(rogue);
        characters.add(monk);
        characters.add(mage);

        // Сортировка по увеличению значения attackPower
        Collections.sort(characters, Comparator.comparingInt(Character::getAttackPower));

        // Вывод отсортированного списка с номерами позиций
        for (int i = 0; i < characters.size(); i++) {
            System.out.println((i + 1) + " " + characters.get(i).getClass().getSimpleName() + "(" + characters.get(i).getAttackPower() + ")");
        }
    }
}


