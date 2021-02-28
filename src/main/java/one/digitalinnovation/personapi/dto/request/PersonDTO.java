package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    private String cpf;

    @NotEmpty
    private String birthDate;

    @NotEmpty
    private List<PhoneDTO> phones = new ArrayList<>();
}
