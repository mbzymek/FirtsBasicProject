import java.util.Scanner;

public class ChoosingLevel {
    private final LevelOfDifficultiesType levelOfDifficultiesType;

    public ChoosingLevel(LevelOfDifficultiesType levelOfDifficultiesType) {
        this.levelOfDifficultiesType = levelOfDifficultiesType;
    }

    public LevelOfDifficultiesType chooseLevel(){
        Scanner in = new Scanner(System.in);
        //System.out.println("Wybierz poziom trudności EASY|MEDIUM|HARD");
        //LevelOfDifficultiesType levelOfDifficultiesType = LevelOfDifficultiesType.valueOf(in.next());
        int number = 0;
        switch (levelOfDifficultiesType)
        {
            case EASY: {
                System.out.println("Ok wybrałeś poziom łatwy");
                System.out.println("Podaj liczbe od 1 do 10");
                number = in.nextInt();
                if (number < 1 || number > 10) {
                    System.out.println("Podana przez Ciebie liczba nie miesci sie w zakresie");
                    return null;
                }
                break;
            }
            case MEDIUM: {
                System.out.println("Wybrałeś poziom sredni");
                System.out.println("Podaj liczbe od 1 do 25");
                number = in.nextInt();
                if (number < 1 || number > 25) {
                    System.out.println("Podana przez Ciebie liczba nie miesci sie w zakresie");
                    return null;
                }
                break;
            }
            case HARD: {
                System.out.println("Wybrales poziom trudny!!!");
                System.out.println("Podaj liczbe od 1 do 50");
                number = in.nextInt();
                if (number < 1 || number > 50) {
                    System.out.println("Podana przez Ciebie liczba nie miesci sie w zakresie");
                    return null;
                }
            }
            break;
        }

        return levelOfDifficultiesType;
    }
}
