package com.example.hngtaskone.data.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class About {
    private String slackUsername;
    private boolean backend;
    private int age;
    private String bio;
}
