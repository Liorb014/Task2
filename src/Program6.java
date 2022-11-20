import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        int number;
        int sumNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("please enter full number");
            number = scanner.nextInt();
        }while (number <= 0);
        int firsNumber = number - (10*(number/10));
        System.out.println(firsNumber);
        for (int i =0; i <=number;i+=10){
            sumNumber = firsNumber + ((number/10)-(number/100));
            System.out.print(sumNumber+" ");
            if (i>100){
                sumNumber =+ (number/100);
            }
        }

    }

}
