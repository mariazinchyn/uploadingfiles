package com.example.uploadfiles;

import com.example.uploadfiles.controller.FileUploadController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;

@SpringBootApplication
@ComponentScan({"com.example.uploadfiles", "controller"})
public class UploadfilesApplication {

    public static void main(String[] args) {
        new File(FileUploadController.uploadDirectory).mkdir();
        SpringApplication.run(UploadfilesApplication.class, args);
    }

}
