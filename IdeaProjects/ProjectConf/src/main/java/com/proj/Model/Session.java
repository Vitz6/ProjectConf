package com.proj.Model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by wincenty on 4/27/2016.
 */
@Entity ///DO POPRAWY
@Table(name="sesja")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_sesji")
    private int id;

    @NotEmpty
    @Column(name="nazwa")
    private String name;

   @Column(name="sesja_ID")
   private int sesionId;

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

    public int getSesionId() {
        return sesionId;
    }

    public void setSesionId(int sesionId) {
        this.sesionId = sesionId;
    }
}

