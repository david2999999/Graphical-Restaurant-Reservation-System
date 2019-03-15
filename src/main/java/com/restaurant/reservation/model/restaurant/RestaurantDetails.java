package com.restaurant.reservation.model.restaurant;

import java.util.ArrayList;

public class RestaurantDetails {
    private Address address;
    private ArrayList<String> tags;
    private String neighborhood;
    private String hoursOfOperation;
    private String Cuisines;
    private String diningStyle;
    private String dressCode;
    private ArrayList<String> paymentOptions;
    private String executiveChef;
    private ArrayList<String> additions;

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getHoursofOperation() {
        return hoursOfOperation;
    }

    public void setHoursofOperation(String hoursOfOperation) {
        this.hoursOfOperation = hoursOfOperation;
    }

    public String getCuisines() {
        return Cuisines;
    }

    public void setCuisines(String cuisines) {
        Cuisines = cuisines;
    }

    public String getDiningStyle() {
        return diningStyle;
    }

    public void setDiningStyle(String diningStyle) {
        this.diningStyle = diningStyle;
    }

    public String getDressCode() {
        return dressCode;
    }

    public void setDressCode(String dressCode) {
        this.dressCode = dressCode;
    }

    public ArrayList<String> getPaymentOptions() {
        return paymentOptions;
    }

    public void setPaymentOptions(ArrayList<String> paymentOptions) {
        this.paymentOptions = paymentOptions;
    }

    public String getExecutiveChef() {
        return executiveChef;
    }

    public void setExecutiveChef(String executiveChef) {
        this.executiveChef = executiveChef;
    }

    public ArrayList<String> getAdditions() {
        return additions;
    }

    public void setAdditions(ArrayList<String> additions) {
        this.additions = additions;
    }
}
