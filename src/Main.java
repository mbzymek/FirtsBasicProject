import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scoring scoring = new Scoring();
        LevelOfDifficultiesType levelOfDifficultiesType = LevelOfDifficultiesType.valueOf(in.next());
        //ChoosingLevel choosingLevel = new ChoosingLevel(levelOfDifficultiesType);
        CalculateEasy calculateEasy = new CalculateEasy();
        LevelOfDifficulties levelOfDifficulties = new LevelOfDifficulties(levelOfDifficultiesType);
        ConsoleReader consoleReader = new ConsoleReader(levelOfDifficultiesType);

        //scoring.chooseNumber();
        scoring.getScoring(levelOfDifficulties,calculateEasy,consoleReader);
//        System.out.println("Witaj w grze odgadnij liczbe");
//        System.out.println("Wybierz poziom trudności EASY|MEDIUM|HARD");
//        LevelOfDifficultiesType levelOfDifficultiesType = LevelOfDifficultiesType.valueOf(in.next());
//        consoleReader.readInputParameters();
//        ChoosingLevel choosingLevel = new ChoosingLevel(levelOfDifficultiesType);
//        choosingLevel.chooseLevel();
        //Scoring scoring = new Scoring(choosingLevel);
        //scoring.getScoring();
    }
}
