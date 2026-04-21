
public class Main {

    public static void main(String[] args) {
        // Test your program here!
        Abbreviations test=new Abbreviations();
        test.addAbbreviation("Love", "Subu");
        System.out.println(test.hasAbbreviation("Love"));
        System.out.println(test.findExplanationFor("Love"));
        System.out.println(test.findExplanationFor("nothing"));
    }
}
