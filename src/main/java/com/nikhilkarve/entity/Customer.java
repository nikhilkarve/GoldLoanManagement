package com.nikhilkarve.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="address")
    private String address;

    @Column(name="subject")
    private String subject;

    @Column(name="principal")
    private int principal;

    @Column(name = "kalamDate")
    private Date kalamDate;

    @Column(name = "interest")
    private int interest;

    @Column(name = "weightSubject")
    private int weightSubject;

    public Customer() {}

    public Customer(String firstName, String lastName, String address, String subject, int principal, Date kalamDate, int interest, int weightSubject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.subject = subject;
        this.principal = principal;
        this.kalamDate = kalamDate;
        this.interest = interest;
        this.weightSubject = weightSubject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public Date getKalamDate() {
        return kalamDate;
    }

    public void setKalamDate(Date kalamDate) {
        this.kalamDate = kalamDate;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public int getWeightSubject() {
        return weightSubject;
    }

    public void setWeightSubject(int weightSubject) {
        this.weightSubject = weightSubject;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
