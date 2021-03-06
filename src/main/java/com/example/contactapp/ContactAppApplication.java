package com.example.contactapp;

import com.example.contactapp.model.ContactD;
import com.example.contactapp.service.ContactDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class ContactAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(ContactAppApplication.class, args);
	}
}
