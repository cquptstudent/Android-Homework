import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * ..
 *
 * @author 2023210515
 * 2023/10/29 23:05
 */
public class Store {
    public static String name = "CQUPT STORE";

    static CquptStudent cqupt = new CquptStudent();
    static Prop prop = new Prop();

    public static void welcome(){
        System.out.println("这是" + name);
        System.out.println("购买道具，改变人生!");
        System.out.println("道具列表");
        System.out.println("序号    名字                          价格  修德  博学  求实  创新  ");

        for(int i = 0; i < 5; i++){
            if(i != 3) {
                System.out.println((i+1) + "    " + prop.name[i] + empty(prop.name[i]) + prop.price[i] + "  " + prop.addMorality[i] + "  " + prop.addKnowledge[i] + "  " + prop.addSeekForReal[i] + "  " + prop.addInnovation[i]);
            }
            else{
                System.out.println((3+1) + "    " + prop.name[3] + "  " + prop.price[3] + "  " + prop.addMorality[3] + "  " + prop.addKnowledge[3] + "  " + prop.addSeekForReal[3] + "  " + prop.addInnovation[3]);
            }
        }
    }

    public static void payAndGet(int choice){
        cqupt.morality += prop.addMorality[choice];
        cqupt.innovation += prop.addInnovation[choice];
        cqupt.knowledge += prop.addKnowledge[choice];
        cqupt.seekForReal += prop.addSeekForReal[choice];
        cqupt.cost += prop.price[choice];
    }

    public static void choose(){
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        StringBuilder string = new StringBuilder();
        while(choice > 0) {
            payAndGet(choice);
            string.append(prop.name[choice - 1]);
            System.out.println("你一共选择了" + string);
            System.out.println("还有想要买的吗");
            choice = scan.nextInt();
        }
        System.out.println("总计: " + cqupt.cost);
        System.out.println(cqupt.name + "的属性提高了: 修德 " + cqupt.morality + " 博学 " + cqupt.knowledge + " 求实 " + cqupt.seekForReal + " 创新 " + cqupt.innovation);
    }

    public static StringBuilder empty(String string){
        int length;
        StringBuilder string2 = new StringBuilder();

        length = 27 - string.length();
        string2.append(" ".repeat(Math.max(0, length)));

        return string2;
    }
}
