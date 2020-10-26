public class Player {
    private  String name;
    private  String lastName;
    private LevelOfDifficultiesType levelOfDifficultiesType;
    private  LevelOfDifficulties levelOfDifficulties;
    public Player(String name, String lastName, LevelOfDifficultiesType levelOfDifficultiesType,LevelOfDifficulties levelOfDifficulties) {
        this.name = name;
        this.lastName = lastName;
        this.levelOfDifficultiesType = levelOfDifficultiesType;
        this.levelOfDifficulties = levelOfDifficulties;
    }
    public Player(String name,String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public Player(LevelOfDifficultiesType levelOfDifficultiesType, LevelOfDifficulties levelOfDifficulties) {
        this.levelOfDifficultiesType = levelOfDifficultiesType;
        this.levelOfDifficulties = levelOfDifficulties;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
