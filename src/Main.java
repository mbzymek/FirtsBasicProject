import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int losEasy;
//        int losMedium;
//        int losHard;
//        int przedzialOd=1;
//        int przedzialDoEasy=10;
//        int przedzialDoMedium=25;
//        int przedzialDoHard=50;
//        System.out.println("Gra odgadnij liczbe");
//        System.out.println("Wybierz poziom trudnosci EASY|MEDIUM|HARD");
//        Random random = new Random();
//        losEasy = random.nextInt(przedzialOd)+przedzialDoEasy;
//        losMedium = random.nextInt(przedzialOd)+przedzialDoMedium;
//        losHard = random.nextInt(przedzialOd)+przedzialDoHard;
        Scanner in = new Scanner(System.in);

        System.out.println("Witaj w grze odgadnij liczbe");
        System.out.println("Wybierz poziom trudności EASY|MEDIUM|HARD");
        LevelOfDifficultiesType levelOfDifficultiesType = LevelOfDifficultiesType.valueOf(in.next());
        ConsoleReader consoleReader = new ConsoleReader(levelOfDifficultiesType);
        consoleReader.readInputParameters();

    }
}
