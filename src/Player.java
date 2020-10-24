public class Player {
    private final String name;
    private final String lastName;
    //private final int number;
    private LevelOfDifficultiesType levelOfDifficultiesType;



    public Player(String name, String lastName, LevelOfDifficultiesType levelOfDifficultiesType) {
        this.name = name;
        this.lastName = lastName;
        //this.number = number;
        this.levelOfDifficultiesType = levelOfDifficultiesType;
    }


    public LevelOfDifficultiesType getLevelOfDifficulty() {
        return levelOfDifficultiesType;
    }

    public void setLevelOfDifficulty(LevelOfDifficultiesType level)
    {
        levelOfDifficultiesType = level;
    }



}
