import java.util.Objects;
import java.util.Scanner;

/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/11
 * 23:01
 */
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("请输入想要打印的作业，1为高数，2为线代，3为英语，0为全部打印");
        int a = new Scanner(System.in).nextInt();
        while(a > 3 || a < 0){
            System.out.println("请重新输入，1为高数，2为线代，3为英语，0为全部打印");
            a = new Scanner(System.in).nextInt();
        }
        switch (a){
            case 1:
                Factory factory = new GaoShuFactory();
                factory.printHomework();
                break;
            case 2:
                Factory factory2 = new XianDaiFactory();
                factory2.printHomework();
                break;
            case 3:
                Factory factory3 = new EnglishFactory();
                factory3.printHomework();
                break;
            case 0:
                Factory factory4 = new ThreeFactory();
                factory4.printHomework();
                break;
        }
    }
}