package com.example.weddingdinner.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;


@Document(collection = "dinner")
public class Dinner {


    @Id
    private String id;

    @Indexed(direction = IndexDirection.ASCENDING)
    private String restaurantname;
    private String phonenumber;
    private String address;
    private String description;
    private String roomdescription;
    private List<RoomFees> roomfees;
    private String pricedescription;
    @Field("price")
    private List<Price> price;


    public Dinner() {
    }

    public Dinner(String restaurantname, String phonenumber, String address, String description, String roomdescription, List<RoomFees> roomfees, String pricedescription, List<Price> price) {
        this.restaurantname = restaurantname;
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

    public String getRestaurantname() {
        return restaurantname;
    }

    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoomdescription() {
        return roomdescription;
    }

    public void setRoomdescription(String roomdescription) {
        this.roomdescription = roomdescription;
    }

    public List<RoomFees> getRoomfees() {
        return roomfees;
    }

    public void setRoomfees(List<RoomFees> roomfees) {
        this.roomfees = roomfees;
    }

    public String getPricedescription() {
        return pricedescription;
    }

    public void setPricedescription(String pricedescription) {
        this.pricedescription = pricedescription;
    }

    public List<Price> getPrice() {
        return price;
    }

    public void setPrice(List<Price> price) {
        this.price = price;
    }
}


