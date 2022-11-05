package com.example.hngtaskone.data.dto;

import com.example.hngtaskone.data.model.OperationType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TaskTwoResponseDto {
    private String slackUsername;
    private int result;
    private String operation_type;
}
