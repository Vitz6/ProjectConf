package com.proj.Model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

/**
 * Created by wincenty on 4/27/2016.
 */
@Entity
@Table(name = "konferencja")
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_konferencji")
    private int id;

    @Column(name = "nazwa")
    private String name;

    @Column(name = "czas_rozpoczecia")
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    private Date dateStart;

    @Column(name = "czas_trwania_dni")
    private int duration;


    @Column(name = "czas_zakonczenia")
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    private Date dateEnd;

    @Column(name = "adres")
    private String adres;

    @NotNull
    @Column(name = "koszt")
    private int expenseId;

    @Column(name = "ilosc_uczestnikow")
    private int members;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }
}
