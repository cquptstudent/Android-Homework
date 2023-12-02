import java.util.Scanner;

/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/5
 * 14:39
 */
public class Hero implements IHero{
    public String name;
    public double hp;
    public double attack;
    public double defend;
    public double[] information;
    public void getHero(String name, double[] information){
        this.name = name;
        hp = information[0];
        attack = information[1];
        defend = information[2];
        this.information = information;
    }

    public String name(){
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        return "Hero " + name;
    }

    @Override
    public double attack(Hero hero, Monster monster) {
        double monsterLose = (hero.attack - monster.defend) > 0 ? hero.attack - monster.defend : 0;
        System.out.println("Monster lost " + monsterLose + "hp");
        monster.hp -= monsterLose;
        return monster.hp;
    }
}
