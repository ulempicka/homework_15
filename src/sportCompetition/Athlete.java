package sportCompetition;

public class Athlete implements Comparable<Athlete> {
    private String firstName;
    private String lastName;
    private int score;

    public Athlete(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Athlete athlete) {
        if(this.score > athlete.score){
            return 1;
        }else if (this.score == athlete.score){
            return this.lastName.compareTo(athlete.lastName);
        }else {
            return -1;
        }
    }
}
