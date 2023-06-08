package org.example;

import java.time.LocalDate;

public class Laptop {
    private String Model;
    private int volumeRAM;
    private int volumeHDD;
    private String typeOS;
    private String color;
    private float price;
    private String serialNum;
    private LocalDate manufactureDate;

    public Laptop(String Model, int volumeRAM, int volumeHDD,
                  String typeOS, String color, float price, String serialNum,
                  LocalDate manufactureDate) {
        this.Model = Model;
        this.volumeRAM = volumeRAM;
        this.volumeHDD = volumeHDD;
        this.typeOS = typeOS;
        this.color = color;
        this.price = price;
        this.serialNum = serialNum;
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        String res = String.format("---------------\nModel: %s, RAM: %dGB, HDD: %dGB,\n",
                Model, volumeRAM, volumeHDD);
        res += String.format("OS: %s, color: %s, cost: %.2f р.,\n",
                typeOS, color, price);
        res += String.format("Serial №: %s, Manufactured date: %s\n",
                serialNum, manufactureDate.toString());

        return res;
    }

   public String getModel() {
        return Model;
    }

    public int getVolumeRAM() {
        return volumeRAM;
    }

    public int getVolumeHDD() {
        return volumeHDD;
    }

    public String getTypeOS() {
        return typeOS;
    }

    public String getColor() {
        return color;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setVolumeRAM(int volumeRAM) {
        this.volumeRAM = volumeRAM;
    }

    public void setVolumeHDD(int volumeHDD) {
        this.volumeHDD = volumeHDD;
    }

    public void setTypeOS(String typeOS) {
        this.typeOS = typeOS;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
