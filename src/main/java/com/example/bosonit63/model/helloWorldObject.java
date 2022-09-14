package com.example.bosonit63.model;

public class helloWorldObject {
    private int id;
    private String content;

    public helloWorldObject(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "helloWorldObject{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}


