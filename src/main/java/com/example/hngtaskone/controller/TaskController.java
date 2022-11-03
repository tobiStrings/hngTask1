package com.example.hngtaskone.controller;

import com.example.hngtaskone.data.dto.OperationDto;
import com.example.hngtaskone.data.model.TaskTwo;
import com.example.hngtaskone.exception.HngException;
import com.example.hngtaskone.service.AboutService;
import com.example.hngtaskone.service.TaskTwoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hngTask")
@AllArgsConstructor
@Slf4j
public class TaskController {
    private final AboutService aboutService;
    private final TaskTwoService taskTwoService;
    @GetMapping("/aboutMe")
    public ResponseEntity<?>getAbout(){
        return ResponseEntity.ok().body(aboutService.getAbout());
    }

    @PostMapping("/task2")
    public ResponseEntity<?> doOperation(@RequestBody OperationDto operationDto){
        TaskTwo taskTwo = TaskTwo.builder()
                .slackUsername("Ligali Titobiloluwa2️⃣")
                .operation_type(null)
                .result(0)
                .build();
        try {
            taskTwo = taskTwoService.doCalculation(operationDto);
            return ResponseEntity.ok().body(taskTwo);
        } catch (HngException e) {
            log.info(e.getLocalizedMessage());
            return ResponseEntity.badRequest().body(taskTwo);
        }
    }

}
