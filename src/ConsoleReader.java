import java.util.Scanner;
public class ConsoleReader {
    LevelOfDifficultiesType levelOfDifficultiesType;
    LevelOfDifficulties levelOfDifficulties;
    public ConsoleReader(LevelOfDifficultiesType levelOfDifficultiesType,LevelOfDifficulties levelOfDifficulties)
    {
        this.levelOfDifficultiesType = levelOfDifficultiesType;
        this.levelOfDifficulties = levelOfDifficulties;
    }
    public Player readInputParameters(){
        return new Player(levelOfDifficultiesType,levelOfDifficulties);
    }

}
