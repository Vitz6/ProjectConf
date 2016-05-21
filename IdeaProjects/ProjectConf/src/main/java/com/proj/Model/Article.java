package com.proj.Model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by wincenty on 5/17/2016.
 */

@Entity
@Table(name = "artykuly")

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @NotEmpty
    @Column(name = "Nazwa",  nullable = false)
    private String  name;

    @Column(name = "id_plik1")
    private int idFile1;

    @Column(name = "id_plik2")
    private int idFile2;

    @Column(name = "id_konf")
    private int idConf;


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

    public int getIdFile2() {
        return idFile2;
    }

    public void setIdFile2(int idFile2) {
        this.idFile2 = idFile2;
    }

    public int getIdFile1() {
        return idFile1;
    }

    public void setIdFile1(int idFile1) {
        this.idFile1 = idFile1;
    }

    public int getIdConf() {
        return idConf;
    }

    public void setIdConf(int idConf) {
        this.idConf = idConf;
    }
}
