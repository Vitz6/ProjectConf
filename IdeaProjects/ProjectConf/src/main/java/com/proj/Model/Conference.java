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
    @Column(name = "id_konferencja")
    private int id;

    @Column(name = "nazwa")
    private String name;

    @Column(name = "czas_rozpoczecia")
   // @DateTimeFormat(pattern = "dd-mm-yyyy")
    private  String dateStart;

    @Column(name = "czas_trwania_dni")
    private int duration;


    @Column(name = "czas_zakonczenia")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date dateEnd;

    @Column(name = "adres")
    private String adress;

    @NotNull
    @Column(name = "id_koszt")
    private int expenseId;

    @Column(name = "ilosc_uczestnikow")
    private int members;

    @Column(name = "liczba_wystapien")
    private int numberof;

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

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumberof() {
        return numberof;
    }

    public void setNumberof(int numberof) {
        this.numberof = numberof;
    }
}
