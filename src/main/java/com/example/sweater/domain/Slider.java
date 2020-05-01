package com.example.sweater.domain;


import javax.persistence.*;

@Entity
@Table (name = "sliders")
public class Slider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String text;
    private String img;
    private int position;

    public Slider(String title, String text, String img, int position) {
        this.title = title;
        this.text = text;
        this.img = img;
        this.position = position;
    }

    public Slider(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
