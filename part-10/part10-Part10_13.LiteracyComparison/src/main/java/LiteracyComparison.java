
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        try {
            List<ArrayList<String>> test=Files.lines(Paths.get("literacy.csv")).map(p->p.split(",")).filter(p->p.length==6).sorted((p1,p2)->{
                return Double.valueOf(p1[5]).compareTo(Double.valueOf(p2[5]));
            }).map(p->new ArrayList<>(Arrays.asList(p))).collect(Collectors.toList());

            test.forEach(p->System.out.println(p.get(3)+" ("+p.get(4)+"), "+p.get(2).trim().substring(0,p.get(2).length()-4).trim()+", "+p.get(5)));
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
