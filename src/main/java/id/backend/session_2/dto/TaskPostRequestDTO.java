package id.backend.session_2.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskPostRequestDTO {
    @NotBlank(message = "title tidak boleh kosong")
    private String title;

    @Size(max = 200, message = "jumlah karakter description tidak boleh lebih dari 200")
    private String description;

    @NotBlank(message = "Priority tidak boleh kosong")
    private String priority;

    @NotNull(message = "Status tidak boleh kosong")
    private Boolean status;

    @NotNull(message = "User_id tidak boleh kosong")
    private int user_id;
}
