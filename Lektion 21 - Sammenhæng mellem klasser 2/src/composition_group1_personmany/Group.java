package composition_group1_personmany;

import java.util.ArrayList;

public class Group {
    private String name;
    // composition: --> 0..* Person
    private ArrayList<Person> persons = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    // -------------------------------------------------------------------------

    public ArrayList<Person> getPersons() {
        return new ArrayList<>(persons);
    }

    public Person createPerson(String personName) {
        Person person = new Person(personName);
        persons.add(person);
        person.setGroup(this);
        return person;
    }

    public void removePerson(Person person) {
        persons.remove(person);
        person.setGroup(null);
    }
}
