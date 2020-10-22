import java.util.Random;

public class Scoring {
    public int getScoring(Player player) {
        Random random = new Random();
        int easy = random.nextInt(10)+1;
        int medium = random.nextInt(25)+1;
        int hard = random.nextInt(50)+1;

    return 0;
    }
}
