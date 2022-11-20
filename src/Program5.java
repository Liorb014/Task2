import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("pleas enter a number for diagnose if is from fibonacci series :");
            userInput = scanner.nextInt();
        }while (userInput<0);
        int number1 = 0;
        int number2 = 1;
        int nextNumber = 0;
        while(nextNumber < userInput){
            nextNumber = number1 + number2;
            number1 = number2;
            number2 = nextNumber;
        }
        if(nextNumber == userInput)
        {
            System.out.println("The number "+ userInput +" belongs to fibonacci arithmetic progression");
        }
        else
        {
            System.out.println("The number "+ userInput + " doesn't belong to fibonacci arithmetic progression");
        }
    }
}