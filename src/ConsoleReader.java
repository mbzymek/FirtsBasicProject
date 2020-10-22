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
        int number = 0;


        return new Player(name,lastName,number, levelOfDifficultiesType);

    }
}
