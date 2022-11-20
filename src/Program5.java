import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("pleas enter a number for diagnose if is from fibonacci series :");
            number = scanner.nextInt();
        }while (number<0);
        boolean answer = false;
        int series = 0;
        for (int i=0; i< number;i++){
            for (int j =0;j<number;j+=i){
                series=j;
                System.out.print(series +" ,");
            }
        }
        if (number == series ){
            answer=true;
        }
        System.out.println(answer);

    }
}