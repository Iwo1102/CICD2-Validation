package ie.atu.validation;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "title cannot be blank")
    @Size(min = 1, max = 3, message = "Is not valid Title")
    private String title;

    @Min(value = 1, message = "Employee ID cannot be less than 1")
    @NotNull(message = "Employee ID is required")
    private int employeeId;

    @Min(value = 18, message = "Age cannot be less than 18")
    @NotNull(message = "Age is required")
    private int age;

    @NotBlank(message =  "Email is required")
    @Email(message = "Not a valid email")
    private String email;

    @NotBlank(message =  "position is  required")
    private String position;

    @NotBlank(message =  "department is  required")
    private String department;
}
