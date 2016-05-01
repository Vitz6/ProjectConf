package com.proj.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by wincenty on 5/1/2016.
 */
@Entity
@Table(name="przypisany_recenzent")
public class RelatedReviewer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_przypisania")
    private int id;

    @NotNull
    @Column(name="referat_id_referat", nullable = false)
    private int reviewId;


    @NotNull
    @Column(name="uzytkownik_id_uzytkownika", nullable = false)
    private int userId;

    @NotNull
    @Column(name="przypisany_recenzent_ID", nullable = false)
    private int reviewerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(int reviewerId) {
        this.reviewerId = reviewerId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

