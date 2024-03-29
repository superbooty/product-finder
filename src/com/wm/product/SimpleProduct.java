package com.wm.product;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "product")
public class SimpleProduct implements Serializable {

    private String url = null;
    private String name = null;
    private double size = 0.0D;
    private double listPrice = 0.0D;
    private double price = 0.0D;
    private DisplayablePrice dispPrice = new DisplayablePrice();
    private String image = null;
    private String description = null;
    private double rating = 0.0D;
    private long id = 0L;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescriptio(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public DisplayablePrice getDispPrice() {
        return this.dispPrice;
    }

    public void setDispPrice(DisplayablePrice dispPrice) {
        this.dispPrice = dispPrice;
    }

}
