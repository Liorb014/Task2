import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        int firstNumber;
        int riseAmount;
        int numbersAmount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please pick up 3 numbers");
        System.out.println("first is the first number of the series, ");
        firstNumber = scanner.nextInt();
        System.out.println("second is the amount u want to add between each number ");
        riseAmount = scanner.nextInt();
        System.out.println("the third is the amount of number u want to be in the series");
        do {
            numbersAmount = scanner.nextInt();
            if(numbersAmount <=0){
                System.out.println("not valid number");
            }
        }while (0 >= numbersAmount);

        for (int i = 0; i < numbersAmount; i++){
            System.out.print("  " + firstNumber);
                    firstNumber += riseAmount;
                }
    }
}
