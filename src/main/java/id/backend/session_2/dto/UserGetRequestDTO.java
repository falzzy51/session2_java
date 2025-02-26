package id.backend.session_2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserGetRequestDTO {
    private Long id;
    private String name;
    private String email;
    private String role;
    private String password;
    private List<TaskGetRequestDTO> tasks;
}
