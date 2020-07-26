package sportCompetition;

import java.util.*;

public class AthleteGenerator {
    public static List<Athlete> createAthlete() {
        List<Athlete> athletes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (Athlete athlete : athletes) {
            System.out.println("Tworzę zawodnika");
            System.out.println("Podaj imię zawodnika");
            String firstName = scanner.nextLine();
            System.out.println("Podaj nazwisko zawodnika");
            String lastName = scanner.nextLine();
            System.out.println("Podaj wynik zawodnika");
            String score = scanner.nextLine();
            if (!(firstName.equals("stop") || lastName.equals("stop") || score.equals("stop"))) {
                athlete = new Athlete(firstName, lastName, Integer.parseInt(score));
                athletes.add(athlete);
            }else {
                scanner.close();
                System.exit(0);
            }
        }
        Collections.sort(athletes);
        return athletes;
    }
}
