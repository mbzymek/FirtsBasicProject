import java.util.Scanner;

public class Scoring {

    public int chooseNumber()
    {
        int i;
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        return i;
    }

    public void getScoring(LevelOfDifficulties levelOfDifficulties, CalculateEasy calculateEasy,ConsoleReader consoleReader) {

        int yourChoice = chooseNumber();
        System.out.println("Your choice is: "+ yourChoice);
        int los;
        consoleReader.readInputParameters();
        switch (levelOfDifficulties.getLevelOfDifficultiesType()){
            case EASY:
                los = calculateEasy.calculate();
                System.out.println("los to "+los);
                break;
        }
        if(yourChoice < calculateEasy.calculate()){
            System.out.println("Your number is too small");
        }
        else if(yourChoice > calculateEasy.calculate()){
            System.out.println("Your number is too big");
        }
        else{
            System.out.println("Congratulations you WIN!!!");
        }
    }
}
