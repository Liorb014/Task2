import java.util.Scanner;

public class Program4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int numbersAmount;
        int count = 0;
        int number = 2;
        int dividerFailCount =0;
        do {
            System.out.println("Please enter how mach numbers u want in your primal-numbersAmount sires: ");
            numbersAmount = scanner.nextInt();
        }while (numbersAmount < 0);
        System.out.println(numbersAmount + " prime numbers: ");
        while (count < numbersAmount){
            for (int divider = 1; divider <= number;divider++ ) {
                if (number % divider == 0){
                    dividerFailCount++;
                }
            }if (dividerFailCount>2){
                number++;
                dividerFailCount=0;
            }if (dividerFailCount==2){
                count++;
                dividerFailCount=0;
                System.out.print(number +" ");
                number++;
            }
        }
    }
}
