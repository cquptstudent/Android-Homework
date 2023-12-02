import java.util.Scanner;

/**
 * ..
 *
 * @author 2023210515
 * @date 2023/11/6
 * 10:44
 */
public class Input {
    public static double getNumber(double min, double max){
        Scanner scanner = new Scanner(System.in);
        double youWant = scanner.nextDouble();
        if(youWant < min || youWant > max){
            System.out.println("Please enter the right number");
            youWant = scanner.nextDouble();
        }

        return youWant;
    }
}
