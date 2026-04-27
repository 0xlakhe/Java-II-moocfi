
import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;
    private Die dice;

    public Die(int numberOfFace) {
        this.random = new Random();
        // Initialize the value of numberOfFaces here
        this.numberOfFaces=numberOfFace;
    }

    public int throwDie() {
        // generate a random number which may be any number
        // between one and the number of faces, and then return it
        Random numbers=new Random();
        return numbers.nextInt(this.numberOfFaces)+1;
    }
}
