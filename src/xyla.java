import java.util.Scanner;

public class xyla {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter how much numbers you want in your primal-number series: ");

        int nNumber;
        int primeNumber = 2;
        int breaker = 3;

        nNumber = scan.nextInt();

        for (int i = 1; i <= nNumber; ) {
            for (int y = 2; y <= Math.sqrt(primeNumber); y++) {
                if (primeNumber % y == 0) {
                    breaker = 0;
                    break;
                }
            }
            if (breaker != 0) {
                System.out.print(primeNumber + " , ");
                i++;
            }
            breaker = 1;
            primeNumber++;
        }
    }
}