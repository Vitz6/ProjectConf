package com.proj.Model;

import org.hibernate.annotations.NotFound;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by wincenty on 4/28/2016.
 */

@Entity
@Table(name="users")

public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;


    @Column(name="username"  ,unique =true)
    private String login;

    @Column(name="password")
    private String password;

    @Column(name="enabled")
    private int enabled;

    @Column(name="imie")
    private String firstName;

    @Column(name="nazwisko")
    private String lastName;

    @Column(name="telefon")
    private int phone;

    @Column(name="adres")
    private String adress;

    @Column(name="nazwa_firmy")
    private String companyName;

    @Column(name="aktywnosc")
    private int activity;

    @Column(name="oplata")
    private float payment;

    @Column(name="recenzent")
    private String reviewer;

    @Column(name="opis")
    private String description;

    public int isEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public int getActivity() {
        return activity;
    }

    public void setActivity(int activity) {
        this.activity = activity;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}

