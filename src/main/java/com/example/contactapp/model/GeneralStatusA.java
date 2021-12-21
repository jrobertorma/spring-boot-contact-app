package com.example.contactapp.model;

import javax.persistence.*;

@Entity
@Table(name = "general_status_a")
public class GeneralStatusA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "general_status_id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "general_status_description", nullable = false)
    private String generalStatusDescription;

    @Lob
    @Column(name = "general_status_code", nullable = false)
    private String generalStatusCode;

    public String getGeneralStatusCode() {
        return generalStatusCode;
    }

    public void setGeneralStatusCode(String generalStatusCode) {
        this.generalStatusCode = generalStatusCode;
    }

    public String getGeneralStatusDescription() {
        return generalStatusDescription;
    }

    public void setGeneralStatusDescription(String generalStatusDescription) {
        this.generalStatusDescription = generalStatusDescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}