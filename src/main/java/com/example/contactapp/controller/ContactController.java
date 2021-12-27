package com.example.contactapp.controller;

import com.example.contactapp.model.ContactD;
import com.example.contactapp.service.ContactDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    ContactDService contactDService;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/contacts")
    public List<ContactD> listAll() {
        return contactDService.getAllContacts();
    }

    @PostMapping("/contacts")
    public List<ContactD> saveProvidedContacts(@RequestBody List<ContactD> contacts) {
        return contactDService.saveContacts(contacts);
    }

    @GetMapping("/active-contacts")
    public List<ContactD> listAllActive() {
        return contactDService.getAllActiveContacts();
    }
}
