package com.paulkruger.hplus.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="CUSTOMERS")
public class Customer {
    @Id
    @Column(name= "CUSTOMER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTIFY)
    private long id;
    @Column(name= "FIRST_NAME")
    private string firstName;
    @Column(name= "LAST_NAME")
    private string lastName;
    @Column(name= "EMAIL")
    private string email;
    @Column(name= "PHONE")
    private string phone;
    @Column(name= "ADDRESS")
    private string address;
    @Column(name= "STATE")
    private string state;
    @Column(name= "ZIPCODE")
    private string zipCode;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public string getFirstName() {
        return firstName;
    }
    public void setFirstName(string firstName) {
        this.firstName = firstName;
    }
    public string getLastName() {
        return lastName;
    }
    public void setLastName(string lastName) {
        this.lastName = lastName;
    }
    public string getEmail() {
        return email;
    }
    public void setEmail(string email) {
        this.email = email;
    }
    public string getPhone() {
        return phone;
    }
    public void setPhone(string phone) {
        this.phone = phone;
    }
    public string getAddress() {
        return address;
    }
    public void setAddress(string address) {
        this.address = address;
    }
    public string getState() {
        return state;
    }
    public void setState(string state) {
        this.state = state;
    }
    public string getZipCode() {
        return zipCode;
    }
    public void setZipCode(string zipCode) {
        this.zipCode = zipCode;
    }
}