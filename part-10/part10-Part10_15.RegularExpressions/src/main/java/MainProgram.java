import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner scanner= new Scanner(System.in);
        Checker test=new Checker();
        while (true) {
            String word=scanner.nextLine();
            if(word.isEmpty()){
                break;
            }
            // System.out.println(test.isDayOfWeek(word.toLowerCase()));
            // System.out.println(test.allVowels(word.toLowerCase()));
            System.out.println(test.timeOfDay(word));

        }
    }
}
