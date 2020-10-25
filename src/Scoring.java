import java.util.Scanner;

public class Scoring {

    public int chooseNumber()
    {
        int i;
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        return i;
    }

    public void easyResult(CalculateEasy calculateEasy){
        if(chooseNumber() < calculateEasy.calculate()){
            System.out.println("Your number is too small");
        }
        else if(chooseNumber() > calculateEasy.calculate()){
            System.out.println("Your number is too big");
        }
        else{
            System.out.println("Congratulations you WIN!!!");
        }
    }

    public void getScoring(LevelOfDifficulties levelOfDifficulties, CalculateEasy calculateEasy,ConsoleReader consoleReader,CalculateMedium calculateMedium,CalculateHard calculateHard) {
        int i;
        Scanner in = new Scanner(System.in);
        //int yourChoice = chooseNumber();
        //System.out.println("Your choice is: "+ yourChoice);
        int los;
        consoleReader.readInputParameters();
        switch (levelOfDifficulties.getLevelOfDifficultiesType()){
            case EASY:
                los = calculateEasy.calculate();
                System.out.println("los to "+los);
                System.out.println("Wprowadz liczbe od 1 do 10");
                i = in.nextInt();
                if(i < calculateEasy.calculate()){
                    System.out.println("Your number is too small");
                }
                else if(i > calculateEasy.calculate()){
                    System.out.println("Your number is too big");
                }
                else{
                    System.out.println("Congratulations you WIN!!!");
                }
                break;
            case MEDIUM:
                los = calculateMedium.calculate();
                System.out.println("los to "+los);
                System.out.println("Wprowadz liczbe od 1 do 25");
                i = in.nextInt();
                if(i < calculateMedium.calculate()){
                    System.out.println("Your number is too small");
                }
                else if(i > calculateMedium.calculate()){
                    System.out.println("Your number is too big");
                }
                else{
                    System.out.println("Congratulations you WIN!!!");
                }
                break;
            case HARD:
                los = calculateHard.calculate();
                System.out.println("los to "+los);
                System.out.println("Wprowadz liczbe od 1 do 10");
                i = in.nextInt();
                if(i < calculateHard.calculate()){
                    System.out.println("Your number is too small");
                }
                else if(i > calculateHard.calculate()){
                    System.out.println("Your number is too big");
                }
                else{
                    System.out.println("Congratulations you WIN!!!");
                }
                break;
        }
    }
}
