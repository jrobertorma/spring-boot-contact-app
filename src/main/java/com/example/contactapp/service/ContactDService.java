package com.example.contactapp.service;

import com.example.contactapp.model.ContactD;
import com.example.contactapp.repository.ContactDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactDService implements IContactDService{
    @Autowired
    ContactDRepository contactDRepository;

    @Override
    public List<ContactD> getAllContacts() {
        return contactDRepository.findAll();
    }

    @Override
    public List<ContactD> getAllActiveContacts() {
        var allContacts = contactDRepository.findAll();
        var activeContacts = new ArrayList<ContactD>();
        for (ContactD contact: allContacts) {
            if(contact.getGeneralStatusSid().equals(1)) {
                activeContacts.add(contact);
            }
        }

        return activeContacts;
    }
}
