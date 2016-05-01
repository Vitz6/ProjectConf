package com.proj.Model;

import javax.persistence.*;

/**
 * Created by wincenty on 4/27/2016.
 */
@Entity
@Table(name="koszt")
public class Expense {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_koszt")
    private int id;

    @Column(name= "kwota")
    private float amount;

    @Column(name="nazwa")
    private String name;

    @Column(name="opis")
    private String description;

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

    public float getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
