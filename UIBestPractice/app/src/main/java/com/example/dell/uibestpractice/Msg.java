package com.example.dell.uibestpractice;

public class Msg {

    static final int TYPE_RECEIVED = 0;

    static final int TYPE_SENT = 1;

    private String content;

    private Integer type;

    public Msg(String content, Integer type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "content='" + content + '\'' +
                ", type=" + type +
                '}';
    }
}
