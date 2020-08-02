package sportCompetition;

import java.util.Objects;

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
        if(this.score < athlete.score){
            return 1;
        }else if (this.score == athlete.score){
            return this.lastName.compareTo(athlete.lastName);
        }else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Athlete athlete = (Athlete) o;
        return score == athlete.score &&
                Objects.equals(firstName, athlete.firstName) &&
                Objects.equals(lastName, athlete.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, score);
    }
}
