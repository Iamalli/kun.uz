package dasturlash.uz.aggregation.dto.profile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProfileRequestDTO {

    private String name;

    private String username;

    private String email;

    private String phone;

    private String password;

}
