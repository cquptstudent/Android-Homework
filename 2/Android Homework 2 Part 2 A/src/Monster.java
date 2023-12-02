/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/5
 * 14:39
 */
public class Monster implements IMonster{
    public String name;
    public double hp;
    public double attack;
    public double defend;
    @Override
    public double attack(Hero hero, Monster monster) {
        double attack = monster.attack*(Math.random() * 2/6) - hero.defend;
        double heroLose = attack > 0 ? attack : 0;//total 6 monsters
        System.out.println("Hero lost " + heroLose + "hp");
        hero.hp -= heroLose;
        if(hero.hp < 0)
            hero.hp = 0;
        if(hero.hp == 0) {
            return -1;
        }
        System.out.println("Hero now last " + hero.hp);
        return hero.hp;
    }
}
