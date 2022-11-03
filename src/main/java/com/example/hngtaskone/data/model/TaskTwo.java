package com.example.hngtaskone.data.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TaskTwo {
    private String slackUsername;
    private OperationType operation_type;
    private int result;
}
