
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");

        Random test=new Random();
        int value=Integer.valueOf(scanner.nextLine());
        for(int i=0;i<value;i++){
            System.out.println(test.nextInt(10));
        }
    }

}
