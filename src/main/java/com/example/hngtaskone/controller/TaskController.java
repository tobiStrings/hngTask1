package com.example.hngtaskone.controller;

import com.example.hngtaskone.service.AboutService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hngTask1")
@AllArgsConstructor
public class TaskController {
    private final AboutService aboutService;

    @GetMapping("/aboutMe")
    public ResponseEntity<?>getAbout(){
        return ResponseEntity.ok().body(aboutService.getAbout());
    }
}
