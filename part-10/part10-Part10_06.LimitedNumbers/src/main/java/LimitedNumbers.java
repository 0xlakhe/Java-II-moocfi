
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers=new ArrayList<>();
        while (true) {
            String number=scanner.nextLine();
            if(Integer.valueOf(number)<0){
                break;
            }
            numbers.add(number);    
        }
        numbers.stream().map(number->Integer.valueOf(number)).filter(number->number>0 && number<=5).forEach(number->System.out.println(number));

    }
}
