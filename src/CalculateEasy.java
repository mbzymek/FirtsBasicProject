import java.util.Random;

public class CalculateEasy {

    public int calculate() {
        Random random = new Random();
        int easy = random.nextInt(10)+1;
        return easy;
    }
}
