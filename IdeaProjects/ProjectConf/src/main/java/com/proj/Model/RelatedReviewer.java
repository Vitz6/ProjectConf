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

}

