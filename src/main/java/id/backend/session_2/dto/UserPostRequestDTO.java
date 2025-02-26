package id.backend.session_2.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserPostRequestDTO {
    private long id;

    @NotBlank(message = "nama tidak boleh kosong!")
    @Size(max = 100, message = "jumlah karakter tidak boleh lebih dari 100!")
    private String name;

    @NotBlank(message = "password tidak boleh kosong!")
    private String password;

    @NotBlank(message = "email tidak boleh kosong!")
    private String email;

    @NotBlank(message = "role tidak boleh kosong!")
    private String role;
}