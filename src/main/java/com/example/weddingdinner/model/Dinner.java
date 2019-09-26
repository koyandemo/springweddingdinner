package com.example.weddingdinner.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "dinner")
public class Dinner {


    @Id
    private String id;

    @Indexed(direction = IndexDirection.ASCENDING)
    private String retaurantname;
    private List<String> phonenumber;
    private String address;
    private List<String> description;
    private List<String> roomdescription;
    private RoomFees roomfees;
    private List<String> pricedescription;
    private Price price;


    public Dinner() {
    }

    public Dinner(String retaurantname, List<String> phonenumber, String address, List<String> description, List<String> roomdescription, RoomFees roomfees, List<String> pricedescription, Price price) {
        this.retaurantname = retaurantname;
        this.phonenumber = phonenumber;
        this.address = address;
        this.description = description;
        this.roomdescription = roomdescription;
        this.roomfees = roomfees;
        this.pricedescription = pricedescription;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRetaurantname() {
        return retaurantname;
    }

    public void setRetaurantname(String retaurantname) {
        this.retaurantname = retaurantname;
    }

    public List<String> getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(List<String> phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public List<String> getRoomdescription() {
        return roomdescription;
    }

    public void setRoomdescription(List<String> roomdescription) {
        this.roomdescription = roomdescription;
    }

    public RoomFees getRoomfees() {
        return roomfees;
    }

    public void setRoomfees(RoomFees roomfees) {
        this.roomfees = roomfees;
    }

    public List<String> getPricedescription() {
        return pricedescription;
    }

    public void setPricedescription(List<String> pricedescription) {
        this.pricedescription = pricedescription;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }


}