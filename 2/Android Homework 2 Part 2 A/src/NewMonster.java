import java.util.Scanner;

/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/5
 * 16:04
 */
public class NewMonster extends Input {
    public static Monster getMonster(){
        Monster monster = new Monster();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the name of monster(1,5000)");
        monster.name = scanner.next();
        System.out.println("Please input the hp of the monster(1,5000)");
        monster.hp = getNumber(1,5000);
        System.out.println("Please input the defend of the monster(1,999)");
        monster.defend = getNumber(1,999);
        System.out.println("Please input the attack of the monster(1,999)");
        monster.attack = getNumber(1,999);

        return monster;
    }
}
