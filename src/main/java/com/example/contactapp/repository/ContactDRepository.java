package com.example.contactapp.repository;

import com.example.contactapp.model.ContactD;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDRepository extends JpaRepository<ContactD, Integer> {
}