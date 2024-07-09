package eliangilsierra.taskorganizer_backend.dto;

import lombok.Data;


import java.sql.Timestamp;

@Data
public class RemindersDto {

    private Integer id;

    private TasksDto task;

    private Timestamp reminderDate;

    private String message;

    private Timestamp createdAt;

    private boolean disabled;
}
