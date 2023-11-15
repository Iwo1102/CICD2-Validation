package ie.atu.validation;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    private String name;
    private String title;
    private int employeeId;
    private int age;
    private String email;
    private String position;
    private String department;
}
