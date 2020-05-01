package com.example.sweater.domain;

import javafx.beans.DefaultProperty;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.MetaValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "carousel")
public class Carousel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String img;
    private String title;
    private String text;

    //@Column(name = "index", nullable = false, columnDefinition = "bigint(20) default 1")
    public Long inde ;

    public Carousel(String img, String title, String text, Long index) {
        this.img = img;
        this.title = title;
        this.text = text;
        this.inde = index;
    }

    public Carousel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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

    public Long getIndex() {
        return inde;
    }

    public void setIndex(Long index) {
        this.inde = index;
    }
}
