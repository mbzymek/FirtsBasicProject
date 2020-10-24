import java.util.Random;

public class CalculateHard {
    public int calculate() {
        Random random = new Random();
        int hard = random.nextInt(50)+1;
        return hard;
    }
}
