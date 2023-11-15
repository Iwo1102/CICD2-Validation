package ie.atu.validation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class PersonService {
    private HashMap<Integer,Person> people = new HashMap<Integer, Person>();

    public String addPerson(Person person) {
        people.put(person.getEmployeeId(), person);
        return "Person " + person.getTitle() + " " + person.getName() + " added";
    }

    public Person getPersonById(int ID) {
        return people.get(ID);
    }
}
