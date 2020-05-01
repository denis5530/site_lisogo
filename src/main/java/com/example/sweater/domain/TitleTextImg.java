package com.example.sweater.domain;


import javax.persistence.*;

@Entity
@Table (name = "titleTextImg")
public class TitleTextImg {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String text;
    private String img;
    private String type;


    public TitleTextImg(String title, String text, String img, String type) {
        this.title = title;
        this.text = text;
        this.img = img;
        this.type = type;
    }

    public TitleTextImg(){

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
