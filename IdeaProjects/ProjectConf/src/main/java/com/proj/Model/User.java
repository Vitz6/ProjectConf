package com.proj.Model;

        import javax.persistence.*;

/**
 * Created by wincenty on 4/28/2016.
 */
@Entity
@Table(name="uzytkownik")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_uzytkownika")
    private int id;

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
    private String activity;

    @Column(name="oplata")
    private float payment;

    @Column(name="recenzent")
    private String reviewer;

    @Column(name="opis")
    private String description;


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

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

