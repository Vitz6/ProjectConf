package com.proj.Model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

/**
 * Created by wincenty on 4/26/2016.
 *
 */
@Entity
@Table(name = "Komentarz")

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_komentarza")
    private int id;

    @NotEmpty
    @Column(name = "zawartosc",  nullable = false)
    private String  contetnt;

    @NotNull
    @Column(name = "czas_dodania")
    private  Date timeAdd;

    @NotNull
    @Size(min = 1)
    @Column(name = "uzytkownik_id_uzytkownika",  nullable = false)
    private int userId;

    @NotNull
    @Size(min = 1)
    @Column(name = "recenzja_id_recenzja" , nullable = false)
    private int reviewID;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContetnt() {
        return contetnt;
    }

    public void setContetnt(String contetnt) {
        this.contetnt = contetnt;
    }

    public Date getTimeAdd() {
        return timeAdd;
    }

    public void setTimeAdd(Date timeAdd) {
        this.timeAdd = timeAdd;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }
}
