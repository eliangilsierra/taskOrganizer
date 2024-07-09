package eliangilsierra.taskorganizer_backend.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class PrioritiesDto {

    private Integer id;

    private String name;

    private Timestamp createdAt;

    private boolean disabled;

    private Integer level;
}
