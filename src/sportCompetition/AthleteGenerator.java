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
        String userInput;

        while (!(userInput = scanner.nextLine()).equals("stop")) {
            System.out.println("Podaj wynik kolejnego gracza (lub stop):");
            String[] split = userInput.split(" ");
            Athlete athlete = new Athlete(split[0], split[1], Integer.parseInt(split[2]));
            athletes.add(athlete);
        }
        Collections.sort(athletes);

        return athletes;
    }
}
