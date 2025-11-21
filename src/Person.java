public class Person {
    // Вложенный public static enum Gender
    public static enum Gender {
        MALE,
        FEMALE
    }

    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return java.util.Objects.equals(name, person.name) &&
                java.util.Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}
