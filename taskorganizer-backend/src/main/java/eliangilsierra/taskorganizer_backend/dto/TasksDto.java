package eliangilsierra.taskorganizer_backend.dto;

import eliangilsierra.taskorganizer_backend.entity.ItemList;
import lombok.Data;


import java.sql.Date;
import java.sql.Timestamp;

@Data
public class TasksDto {

    private Integer id;

    private UsersDto user;

    private String title;

    private String description;

    private Date dueDate;

    private PrioritiesDto priority;

    private ItemList status;

    private Timestamp createdAt;

    private Timestamp updatedAt;

    private boolean disabled;
}
