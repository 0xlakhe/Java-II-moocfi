import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainProgram {

    public static void main(String[] args) {
        List<Student> test=new ArrayList<>(); 
       Student first = new Student("jamo");
       Student second = new Student("jamo1");
       test.add(second);
       test.add(first);
       Collections.sort(test);
       System.out.println(first.compareTo(second));
       System.out.println(test);
    }
}
