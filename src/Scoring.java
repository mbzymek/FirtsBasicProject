import java.util.Scanner;

public class Scoring {

    public void decision(int i,int los){
        if(i < los){
            System.out.println("Your number is too small");
        }
        else if(i > los){
            System.out.println("Your number is too big");
        }
        else if(i == los){
            System.out.println("Congratulations you WIN!!!");
        }
    }

    public void easyResult(int i,int los,int licznik)
    {
            decision(i,los);
            licznik ++;
            if(licznik == 3 && i != los)
            {
                System.out.println("Przegrales, wykorzystales 3 próby");
            }
    }

    public void mediumResult(int i,int los,int licznik)
    {
        decision(i,los);
        licznik ++;
        if(licznik == 4 && i != los)
        {
            System.out.println("Przegrales, wykorzystales 4 próby");
        }
    }

    public void hardResult(int i,int los,int licznik)
    {
        decision(i,los);
        licznik ++;
        if(licznik == 5 && i != los)
        {
            System.out.println("Przegrales, wykorzystales 5 prób");
        }
    }

    public void getScoring(LevelOfDifficulties levelOfDifficulties, CalculateEasy calculateEasy,ConsoleReader consoleReader,CalculateMedium calculateMedium,CalculateHard calculateHard) {
        int i;
        Scanner in = new Scanner(System.in);
        int los;
        int licznik = 0;
        consoleReader.readInputParameters();
        switch (levelOfDifficulties.getLevelOfDifficultiesType()){
            case EASY:
                los = calculateEasy.calculate();
                //System.out.println("los to "+los);
                System.out.println("Wprowadz liczbe od 1 do 10");
                int k =3;
                while(k >= 1){
                    i = in.nextInt();
                    if(i<1 || i >10 ){
                        System.out.println("Liczba nie miesci sie w przedziale");
                        System.exit(0);
                    }
                    easyResult(i,los,licznik);
                    k--;
                    System.out.println("Pozostało prób: "+ k);
                }
                break;
            case MEDIUM:
                los = calculateMedium.calculate();
                //System.out.println("los to "+los);
                System.out.println("Wprowadz liczbe od 1 do 25");
                int l =4;
                while(l >= 1){
                    i=in.nextInt();
                    if(i<1 || i >25 ){
                        System.out.println("Liczba nie miesci sie w przedziale");
                        System.exit(0);
                    }
                    mediumResult(i,los,licznik);
                    l--;
                    System.out.println("Pozostało prób: "+l);
                }
                break;
            case HARD:
                los = calculateHard.calculate();
                //System.out.println("los to "+los);
                System.out.println("Wprowadz liczbe od 1 do 50");
                int m = 5;
                while(m >= 1){
                    i=in.nextInt();
                    if(i<1 || i >50 ){
                        System.out.println("Liczba nie miesci sie w przedziale");
                        System.exit(0);
                    }
                    hardResult(i,los,licznik);
                    m--;
                    System.out.println("Pozostało prób: "+m);
                }
                break;
        }
    }
}
