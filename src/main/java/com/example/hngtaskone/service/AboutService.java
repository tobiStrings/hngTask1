package com.example.hngtaskone.service;

import com.example.hngtaskone.model.About;
import org.springframework.stereotype.Service;

@Service
public class AboutService {

    public About getAbout(){
        return About.builder()
                .slackUsername("Ligali Titobiloluwa1️⃣")
                .backend(true)
                .age(17)
                .bio("I am titobiloluwa a java backend developer")
                .build();
    }
}
