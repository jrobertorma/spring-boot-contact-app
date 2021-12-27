package com.example.contactapp.service;

import com.example.contactapp.model.ContactD;

import java.util.List;

public interface IContactDService {
    List<ContactD> getAllContacts();

    List<ContactD> getAllActiveContacts();

    List<ContactD> saveContacts(List<ContactD> contactsToSave);
}
