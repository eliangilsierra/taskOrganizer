package eliangilsierra.taskorganizer_backend.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class UsersDto {

    private Integer id;

    private String username;

    private String email;

    private String password;

    private Timestamp createdAt;

    private boolean disabled;
}
