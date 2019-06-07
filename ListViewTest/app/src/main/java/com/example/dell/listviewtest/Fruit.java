package com.example.dell.listviewtest;

public class Fruit {
    private String name;

    private Integer imageId;

    public Fruit(String name, Integer imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", imageId=" + imageId +
                '}';
    }
}
