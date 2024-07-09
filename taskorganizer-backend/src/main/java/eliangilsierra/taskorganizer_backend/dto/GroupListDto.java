package eliangilsierra.taskorganizer_backend.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class GroupListDto {

    private Integer id;

    private String name;

    private String code;

    private Timestamp createdAt;

    private boolean disabled;
}
