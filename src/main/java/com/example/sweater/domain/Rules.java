package com.example.sweater.domain;

import javax.persistence.*;

@Entity
@Table(name = "ruleses")
public class Rules {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Rules() {
    }

    private String froms;
    private String tos;
    private String login;

    public Long getId() {
        return id;
    }

    public Rules(String froms, String tos, String login) {
        this.froms = froms;
        this.tos = tos;
        this.login = login;
    }

    public String getFroms() {
        return froms;
    }

    public void setFroms(String froms) {
        this.froms = froms;
    }

    public String getTos() {
        return tos;
    }

    public void setTos(String tos) {
        this.tos = tos;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
