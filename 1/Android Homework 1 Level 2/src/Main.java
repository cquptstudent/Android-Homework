
/**
 * ..
 *
 * @author 2023210515
 * 2023/10/29 21:45
 */
public class Main {
    public static void main(String[] args) {
        int number;
        int count = 0;

        for (number = 100; number < 1000; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
                if(count % 10 == 0 & count != 0){
                    System.out.println();
                }
            }
        }
    }

    public static boolean isPrime(int number) {
        int division;
        for (division = 2; division <= Math.sqrt(number); division++) {
            if (number % division == 0) {
                return false;
            }
        }
        return true;
    }
}


