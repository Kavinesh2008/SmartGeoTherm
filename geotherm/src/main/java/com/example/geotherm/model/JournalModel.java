package com.example.geotherm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="journal")
public class JournalModel {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String journal_code;
    private String journal_name;
    private String journal_type;
    private String description;
    private String status;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getJournal_code() {
        return journal_code;
    }
    public void setJournal_code(String journal_code) {
        this.journal_code = journal_code;
    }
    public String getJournal_name() {
        return journal_name;
    }
    public void setJournal_name(String journal_name) {
        this.journal_name = journal_name;
    }
    public String getJournal_type() {
        return journal_type;
    }
    public void setJournal_type(String journal_type) {
        this.journal_type = journal_type;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}
