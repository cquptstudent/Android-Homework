import java.util.ArrayList;
import java.util.Scanner;

/**
 * ..
 *
 * @author 2023210515
 * @Date 2023/11/6
 * @time 11:51
 */
public class Main {
    static Hero hero1 = new Hero();
    static ArrayList<Monster> monster1 = new ArrayList<>();


    public static void getMonster(ArrayList<Monster> monster){
        monster1.add(NewMonster.getMonster());
        for(int i = 1; i <= 6; i++){
            monster1.add(monster1.get(0));
        }

        for(int i = 1; i <= 5; i++){
            monster1.get(i).hp = monster1.get(0).hp;
            monster1.get(i).defend = monster1.get(0).defend;
            monster1.get(i).attack = monster1.get(0).attack;
            monster1.get(i).name = monster1.get(0).name;
//            monster1.get(i).attack *=  1  * (0.2 * level) + 0.8;
//            monster1.get(i).hp *= 1  * (0.2 * level) + 0.8;
//            monster1.get(i).defend *= 1  * (0.2 * level) + 0.8;
//            monster1.get(i).name += " plus";
        }
    }

    static int level = 1;
    static boolean heroIsAlive = true;


    public static void main(String[] args) {


        NewHero.getHero(hero1);
        getMonster(monster1);
        double hp = monster1.get(0).hp;
        double attack = monster1.get(0).attack;
        double defend = monster1.get(0).defend;
        String name = monster1.get(0).name;
        System.out.println("Hero name:" + hero1.name);
        System.out.println("Hero hp:" + hero1.hp);
        do {


            for (int i = 0; i <= 5; i++) {
                hero1.hp = monster1.get(i).attack(hero1, monster1.get(i));
                if(hero1.hp <= 0)
                    heroIsAlive = false;
            }
            if(!heroIsAlive) {
                break;
            }
            System.out.println("Please choose one Monster to attack, enter 0 to kill one monster");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if(choice == 0){
                choice = (int) (Math.random() * 5 + 1);
            }

           monster1.get(choice).hp = hero1.attack(hero1, monster1.get(choice));

            for (int i = 0; i <= 5; i++) {
                if (monster1.get(i).hp < 0) {
                    monster1.get(i).hp = 0;
                }
            }

            int random2 = (int) ((int) (Math.random() * 20));
            int equipmentNum = getEquipmentNum(random2);

            Equipment equipment = new Equipment0();

            if(random2 >= 15){

                if(equipmentNum == 1){
                    equipment = new Equipment1();
                } else if (equipmentNum == 2) {
                    equipment = new Equipment2();
                } else if (equipmentNum == 3) {
                    equipment = new Equipment3();
                } else if (equipmentNum == 4) {
                    equipment = new Equipment4();
                } else if (equipmentNum == 5) {
                    equipment = new Equipment5();
                } else if (equipmentNum == 6) {
                    equipment = new Equipment6();
                }
                System.out.println("You got a equipment: " + equipment.name);
                hero1.attack *= equipment.addAttack;
                hero1.defend *= equipment.addDefend;
                hero1.hp *= equipment.addHp;
                for(int i = 0; i <= 5; i++){
                    monster1.get(i).hp *= equipment.reduceHp;
                    monster1.get(i).attack *= equipment.reduceAttack;
                    monster1.get(i).defend *= equipment.reduceDefend;
                }
                System.out.println("Hero defend:" + hero1.defend);
                System.out.println("Hero attack:" + hero1.attack);
            }
            System.out.println("Hero hp:" + hero1.hp);

            double sum  = 0;
            for(int i = 0; i < 6; i++){
                if(monster1.get(i).hp < 1e-5) {
                    monster1.get(i).hp  = 0;
                }
                sum += monster1.get(i).hp;
            }
            if(sum == 0){
                System.out.println("Now a new part of monster comes!");
                level++;
                for(int i=0;i<=5;i++) {
                    monster1.get(i).hp = hp * (1.1 + (level * 0.2));
                    monster1.get(i).attack = attack * (1.1 + (level  * 0.2));
                    monster1.get(i).defend = defend * (1.1 + (level * 0.2));
                    monster1.get(i).name = name;
                    for(int j = 0; j < level; j++)
                        monster1.get(i).name += " plus";
                }
                hero1.hp *= (1 + level*0.1);
                hero1.attack *= (1 + level*0.1);
                hero1.defend *= (1 + level*0.1);
                System.out.println("It's level " + level);
            }
            if(hero1.attack < 1e-5)
                heroIsAlive = false;
            System.out.println("monster1 " + monster1.get(0).name + " hp:" + monster1.get(0).hp);
            System.out.println("monster2 " + monster1.get(1).name + " hp:" + monster1.get(1).hp);
            System.out.println("monster3 " + monster1.get(2).name + " hp:" + monster1.get(2).hp);
            System.out.println("monster4 " + monster1.get(3).name + " hp:" + monster1.get(3).hp);
            System.out.println("monster5 " + monster1.get(4).name + " hp:" + monster1.get(4).hp);
            System.out.println("monster6 " + monster1.get(5).name + " hp:" + monster1.get(5).hp);
        }while(heroIsAlive);
        System.out.println();
        System.out.println("You die!");
    }


    private static int getEquipmentNum(int random2) {
        int equipmentNum = 0;//whether it falls an equipment
         if (random2 == 16) {
            equipmentNum = 1;
        }else if (random2 == 17) {
            equipmentNum = 2;
        }else if (random2 == 18) {
            equipmentNum = 3;
        }else if (random2 == 19) {
            equipmentNum = 4;
        }else if (random2 == 20) {
            equipmentNum = 5;
        }else if (random2 == 15) {
            equipmentNum = 6;
        }
        return equipmentNum;
    }

}