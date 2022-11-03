package com.example.hngtaskone.service;
import com.example.hngtaskone.data.dto.OperationDto;
import com.example.hngtaskone.data.model.OperationType;
import com.example.hngtaskone.data.model.TaskTwo;
import com.example.hngtaskone.exception.HngException;
import org.springframework.stereotype.Service;

@Service
public class TaskTwoService {

    public TaskTwo doCalculation(OperationDto operationDto) throws HngException {
        validate(operationDto);
        OperationType operationType = checkOperation(operationDto.getOperationType());
        if(operationType.equals(OperationType.ADDITION)){
            return TaskTwo.builder()
                    .slackUsername("Ligali Titobiloluwa2️⃣")
                    .operation_type(OperationType.ADDITION)
                    .result(operationDto.getX() + operationDto.getY())
                    .build();
        }
        if(operationType.equals(OperationType.MULTIPLICATION)){
            return TaskTwo.builder()
                    .slackUsername("Ligali Titobiloluwa2️⃣")
                    .operation_type(OperationType.MULTIPLICATION)
                    .result(operationDto.getX() * operationDto.getY())
                    .build();
        }
        if(operationType.equals(OperationType.SUBTRACTION)){
            return TaskTwo.builder()
                    .slackUsername("Ligali Titobiloluwa2️⃣")
                    .operation_type(OperationType.SUBTRACTION)
                    .result(operationDto.getX() - operationDto.getY())
                    .build();
        }
        return TaskTwo.builder()
                .slackUsername("Ligali Titobiloluwa2️⃣")
                .operation_type(null)
                .result(0)
                .build();
    }

    private void validate(OperationDto operationDto) throws HngException {
        if (operationDto.getOperationType().isEmpty() || operationDto.getOperationType().trim().isEmpty()){
            throw new HngException("Operation type cannot be empty or blank");
        }

        if (!(operationDto.getOperationType().equalsIgnoreCase(OperationType.ADDITION.name()))
            && !(operationDto.getOperationType().equalsIgnoreCase(OperationType.MULTIPLICATION.name()))
                && !operationDto.getOperationType().equalsIgnoreCase(OperationType.SUBTRACTION.name())
        ){
            throw new HngException("Operation type is invalid.");
        }
    }

    private OperationType checkOperation(String operation){
        if(operation.equalsIgnoreCase(OperationType.SUBTRACTION.name())){
            return OperationType.SUBTRACTION;
        }
        if(operation.equalsIgnoreCase(OperationType.MULTIPLICATION.name())){
            return OperationType.MULTIPLICATION;
        }
        if(operation.equalsIgnoreCase(OperationType.ADDITION.name())){
            return OperationType.ADDITION;
        }
        return null;
    }
}
