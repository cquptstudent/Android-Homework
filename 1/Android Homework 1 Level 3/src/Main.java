/**
 * ..
 *
 * @author 2023210515
 * 2023/10/29 22:00
 */
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] pool = {{"超级稀有"}, {"稀有", "稀有", "稀有", "稀有"}, {"普通", "普通",
                "普通", "普通", "普通", "普通", "普通", "普通"}};
        Random random = new Random();
        int list = Math.abs(random.nextInt() % 13) + 1;
        Scanner scan  = new Scanner(System.in);
        int time = scan.nextInt();

        String[] string = new String[time];

        for(int i = 0; i < time; i++) {
            if (list == 1) {
                string[i] = pool[0][0];
            } else if (list > 1 && list <= 5) {
                string[i] = pool[1][list - 2];
            } else if(list > 5){
                string[i] = pool[2][list - 6];
            }
            System.out.println(string[i]);
            list = Math.abs(random.nextInt() % 13) + 1;
        }
    }
}