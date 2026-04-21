import java.util.HashMap;

public class Abbreviations {
    private HashMap<String,String> word;
    public Abbreviations(){
        this.word=new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        word.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        return word.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        return word.get(abbreviation);
    }
}
