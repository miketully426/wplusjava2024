package org.launchcode.blog.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Blog {

    @NotBlank
    @Size(min=10, message="Title must be at least 10 characters.")
    private String title;

    @NotBlank
    private String content;

    private Emotion emotion;

    public Blog(){}

    public Blog(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Emotion getEmotion() {
        return emotion;
    }

//    public void setEmotion(Emotion emotion) {
//        this.emotion = emotion;
//    }

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
