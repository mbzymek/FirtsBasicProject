import java.util.Scanner;
public class ConsoleReader {
    LevelOfDifficultiesType levelOfDifficultiesType;
    public ConsoleReader(LevelOfDifficultiesType levelOfDifficultiesType)
    {
        this.levelOfDifficultiesType = levelOfDifficultiesType;
    }
    public Player readInputParameters(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imie");
        String name = in.next();
        System.out.println("Podaj nazwisko");
        String lastName = in.next();
        System.out.println("Podaj poziom EASY|MEDIUM|HARD");
        LevelOfDifficultiesType levelOfDifficultiesType = LevelOfDifficultiesType.valueOf(in.next());



        return new Player(name,lastName,levelOfDifficultiesType);

    }
}
