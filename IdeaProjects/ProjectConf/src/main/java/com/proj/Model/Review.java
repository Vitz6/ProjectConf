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
}