package com.example.geotherm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="account")
public class AccountModel {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String account_code;
    private String account_name;
    private String account_type;
    private String description;
    private String status;
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getAccount_code() {
    return account_code;
}
public void setAccount_code(String account_code) {
    this.account_code = account_code;
}
public String getAccount_name() {
    return account_name;
}
public void setAccount_name(String account_name) {
    this.account_name = account_name;
}
public String getAccount_type() {
    return account_type;
}
public void setAccount_type(String account_type) {
    this.account_type = account_type;
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
};
    
}
