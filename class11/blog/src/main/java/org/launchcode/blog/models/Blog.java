package org.launchcode.blog.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Blog {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank
    @Size(min=10, message="Title must be at least 10 characters.")
    private String title;

    @NotBlank
    private String content;

    private Emotion emotion;

    @ManyToOne
    private User user;

    public Blog(){}

    public Blog(String title, String content, User user) {
        this.title = title;
        this.content = content;
        this.user = user;
    }

    public Emotion getEmotion() {
        return emotion;
    }

//    public void setEmotion(Emotion emotion) {
//        this.emotion = emotion;
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
