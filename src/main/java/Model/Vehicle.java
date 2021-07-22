package Model;

import Helpers.HelperFunctions;

import java.time.LocalDate;
import java.io.Serializable;

public class Vehicle implements Serializable{
    private int Id;
    private String Brand;
    private String Model;
    private LocalDate FirstRegistrationDate;
    private int HorsePower;
    private Double Price;
    private int Seats;
    private Double TaxRate;
    private String NumberPlate;




    public Vehicle(String brand, String model, LocalDate firstRegistrationDate, int horsePower, Double price, int seats, String numberPlate) {
        this.Id = HelperFunctions.createCarID();
        this.Brand = brand;
        this.Model = model;
        this.FirstRegistrationDate = firstRegistrationDate;
        this.HorsePower = horsePower;
        this.Price = price;
        this.Seats = seats;
        this.TaxRate = 1.0;
        this.NumberPlate = numberPlate;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public LocalDate getFirstRegistrationDate() {
        return FirstRegistrationDate;
    }

    public void setFirstRegistrationDate(LocalDate firstRegistrationDate) {
        FirstRegistrationDate = firstRegistrationDate;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        this.Price = price;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int seats) {
        Seats = seats;
    }

    public Double getTaxRate() {
        return TaxRate;
    }

    public void setTaxRate(Double taxRate) {
        TaxRate = taxRate;
    }

    public String getNumberPlate() {

        return NumberPlate;

        }
    public double calculateTax() {
        return getTaxRate()*getPrice()+(getSeats()*500);
    }


    public void setNumberPlate(String numberPlate) {
        NumberPlate = numberPlate;
    }



    






}
