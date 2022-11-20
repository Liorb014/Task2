import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("Hello we will help u to solve quadratic equation");
        Scanner scanner = new Scanner(System.in);
        double parameterA;
        double parameterB;
        double parameterC;
        do{
        System.out.println("please enter parameter a :");
        parameterA = scanner.nextInt();
        }while (parameterA==0);
        System.out.println("please enter parameter b :");
        parameterB = scanner.nextInt();
        System.out.println("please enter parameter c :");
        parameterC = scanner.nextInt();
        double solution1;
        double solution2;
        solution1 = ((-1 * parameterB + Math.sqrt(parameterB * parameterB - 4 * parameterA * parameterC)) / (2 * parameterA));
        if (solution1 == 0 || solution1 > 0 || solution1 < 0) {
            System.out.println("x1=:" + solution1);
        }else {
            System.out.println("there is no solution");
        }
        solution2 = ((-1 * parameterB - Math.sqrt(parameterB * parameterB - 4 * parameterA * parameterC)) / (2 * parameterA));
        if (solution1 == solution2 && solution1 == 0 || solution1 > 0 || solution1 < 0) {
            System.out.println("there is only one solution");
        }else {
            if (solution2 == 0 || solution2 >0 || solution2 < 0) {
                System.out.println("x2=:" + solution2);
            }else {
                if (solution2==solution1 ) {
                    System.out.println("there is no solution");
                }else{
                    System.out.println("there is only one solution");
                }
            }
        }
    }
}