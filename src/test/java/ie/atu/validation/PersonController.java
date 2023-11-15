package ie.atu.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/createPerson")
    public String createPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<?> getPerson(@PathVariable String employeeId) {
        if ((employeeId.length() > 5) || employeeId.isBlank()) {
            return ResponseEntity.badRequest().body("EmployeeId is invalid");
        }
        int id = Integer.parseInt(employeeId);

        Person person = personService.getPersonById(id);

        if (person == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(person);
    }
}
