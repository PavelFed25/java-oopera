import java.util.Objects;

public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Person.Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() { return numberOfShows; }
    public void setNumberOfShows(int numberOfShows) { this.numberOfShows = numberOfShows; }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Director director = (Director) obj;
        return numberOfShows == director.numberOfShows;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfShows);
    }
}
