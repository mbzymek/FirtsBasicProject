import java.util.Random;

public class CalculateMedium {
        public int calculate() {
            Random random = new Random();
            int medium = random.nextInt(25)+1;
            return medium;
        }
}
