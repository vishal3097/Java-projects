package com.storage.mywarehouse.Entity;

public class Customer  implements java.io.Serializable {


     private int customerId;
     private String name;
     private String lastName;
     private String occupation;
     private double discount;
     private String email;
     private String city;
     private String postal;
     private String telephone;


    public Customer() {
    }

    public Customer(int customerId, String name, String lastName, String occupation, double discount,
                    String email, String city, String postal, String telephone) {
        this.customerId = customerId;
        this.name = name;
        this.lastName = lastName;
        this.occupation = occupation;
        this.discount = discount;
        this.email = email;
        this.city = city;
        this.postal = postal;
        this.telephone = telephone;
    }

    public int getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getOccupation() {
        return this.occupation;
    }
    
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public double getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}


