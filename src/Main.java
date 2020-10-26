import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name,lastName;
        Scanner in = new Scanner(System.in);
        Scoring scoring = new Scoring();
        System.out.println("Guess The Number ");
        System.out.println("Wybierz poziom EASY|MEDIUM|HARD");
        LevelOfDifficultiesType levelOfDifficultiesType = LevelOfDifficultiesType.valueOf(in.next());
        LevelOfDifficulties levelOfDifficulties = new LevelOfDifficulties(levelOfDifficultiesType);
        CalculateEasy calculateEasy = new CalculateEasy();
        CalculateMedium calculateMedium = new CalculateMedium();
        CalculateHard calculateHard = new CalculateHard();
        System.out.println("Wprowadz imie");
        name = in.next();
        System.out.println("Wprowadz nazwisko");
        lastName = in.next();
        System.out.println("Witaj w grze "+ name +" "+lastName+" Wybrales poziom " + levelOfDifficulties.getLevelOfDifficultiesType());
        //Player player = new Player(name,lastName);
        //System.out.println(player.getName() + player.getLastName());
        ConsoleReader consoleReader = new ConsoleReader(levelOfDifficultiesType,levelOfDifficulties);
        scoring.getScoring(levelOfDifficulties,calculateEasy,consoleReader,calculateMedium,calculateHard);
    }
}