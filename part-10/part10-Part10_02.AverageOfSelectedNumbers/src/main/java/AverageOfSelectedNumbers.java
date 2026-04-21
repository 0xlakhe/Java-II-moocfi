
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, \"end\" to stop");
        List<String> numbers= new ArrayList<>();
        while (true) {
            String number=scanner.nextLine();
            if(number.equals("end")){
                break;
            }
            numbers.add(number);
        }
        System.out.println("Print the average of the negative or the positive numbers? (n/p)");
        String choice=scanner.nextLine();
        if(choice.equals("p")){
            double average= numbers.stream().mapToInt(n->Integer.valueOf(n)).filter(n->n>0).average().getAsDouble();
            System.out.println("Average of the positive numbers: "+ average);
        }else{
            double average= numbers.stream().mapToInt(n->Integer.valueOf(n)).filter(n->n<0).average().getAsDouble();
            System.out.println("Average of the negative numbers: "+ average);
        }

        
    }
}
