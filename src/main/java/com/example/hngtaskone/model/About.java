package com.example.hngtaskone.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class About {
    private String slackUserName;
    private boolean backend;
    private int age;
    private String bio;
}
