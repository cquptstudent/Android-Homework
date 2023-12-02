import java.util.Scanner;

/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/5
 * 15:36
 */
public class NewHero extends Input{

    public static void getHero(Hero hero){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the name of hero");
        hero.name = scanner.next();
        System.out.println("Please input the hp of the hero (1,9999)");
        //hero.hp = scanner.nextDouble();
        hero.hp = getNumber(1,9999);
        System.out.println("Please input the defend of the hero(1,999)");
        //hero.defend = scanner.nextDouble();
        hero.defend = getNumber(1,999);
        System.out.println("Please input the attack of the hero(1,999)");
        //hero.attack = scanner.nextDouble();
        hero.attack = getNumber(1,999);
    }


}
