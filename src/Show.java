import java.util.ArrayList;
import java.util.List;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public Director getDirector() { return director; }
    public void setDirector(Director director) { this.director = director; }

    public List<Actor> getListOfActors() { return listOfActors; }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Предупреждение: Актёр " + actor.getName() + " "
                    + actor.getSurname() + " уже участвует в спектакле!");
            return;
        }
        listOfActors.add(actor);
        System.out.println("Актёр " + actor.getName() + " "
                + actor.getSurname() + " добавлен в спектакль.");
    }

    public void replaceActor(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр с фамилией " + surname + " заменён на "
                        + newActor.getName() + " " + newActor.getSurname());
                return;
            }
        }
        System.out.println("Предупреждение: Актёр с фамилией " + surname + " не найден!");
    }

    public void printActorsList() {
        System.out.println("Список актёров:");
        for (Actor actor : listOfActors) {
            System.out.println("- " + actor);
        }
    }

    @Override
    public String toString() {
        return "Спектакль: " + title + "\n"
                + "Режиссёр: " + director + "\n"
                + "Длительность: " + duration + " мин.";
    }
}
