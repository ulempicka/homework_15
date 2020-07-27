package sportCompetition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AthleteGenerator {
    public static List<Athlete> createAthlete() {
        List<Athlete> athletes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tworzę zawodnika");
        System.out.println("Podaj wynik kolejnego gracza (lub stop):");
        String userInput = scanner.nextLine();
        int i = 0;
        while (!(userInput.equals("stop"))) {
            String[] split = userInput.split(" ");
            Athlete athlete = new Athlete(split[0], split[1], Integer.parseInt(split[2]));
            athletes.add(athlete);
            i++;
        }
        scanner.close();
        Collections.sort(athletes);
        return athletes;
    }
}
