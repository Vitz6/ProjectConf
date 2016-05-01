package com.proj.Model;

/**
 * Created by wincenty on 5/1/2016.
 */

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="recenzja")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_recenzja")
    private int id;

    @Column(name="nazwa")
    private String name;

    @Column(name="ocena_ogolna")
    private int rating_;

    @Column(name="poprawnosc_merytoryczna")
    private int rating2;

    @Column(name="ocena_stylistyki")
    private int rating3;

    @Column(name="jezyk_recenzjii")
    private String language;

    @Column(name="tresc")
    private String content;

    @NotNull
    @Column(name="przypisany_recenzent_przypisany_recenzent_ID", nullable =false)
    private int ReviewerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReviewerId() {
        return ReviewerId;
    }

    public void setReviewerId(int reviewerId) {
        ReviewerId = reviewerId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getRating3() {
        return rating3;
    }

    public void setRating3(int rating3) {
        this.rating3 = rating3;
    }

    public int getRating2() {
        return rating2;
    }

    public void setRating2(int rating2) {
        this.rating2 = rating2;
    }

    public int getRating_() {
        return rating_;
    }

    public void setRating_(int rating_) {
        this.rating_ = rating_;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

