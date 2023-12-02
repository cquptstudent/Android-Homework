/**
 * ..
 * Default (Template) Project
 *
 * @author 2023210515
 * 2023/10/29 21:15
 */

public class Main{
    public static void main(String[] args) {
        int hundred, ten, one, number;
        for(number = 100; number < 1000; number++){
            hundred = number / 100;
            ten = (number - hundred * 100) / 10;
            one = number % 10;
            if(Math.pow(hundred, 3) + Math.pow(ten, 3) + Math.pow(one, 3) == (double)number)
            {
                System.out.println(number);
            }
        }
    }
}