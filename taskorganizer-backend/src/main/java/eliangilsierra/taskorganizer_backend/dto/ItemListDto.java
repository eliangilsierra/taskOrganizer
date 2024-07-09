package eliangilsierra.taskorganizer_backend.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ItemListDto {

    private Integer id;

    private String name;

    private String code;

    private GroupListDto groupList;

    private Timestamp createdAt;

    private boolean disabled;
}
