package Model;

import Model.Car;

import java.time.LocalDate;

public class Supercar extends Car {



    public Supercar(String brand, String model, LocalDate firstRegistrationDate, int horsePower, Double price, int seats, String numberPlate) {
        super(brand, model, firstRegistrationDate, horsePower, price, seats, numberPlate);
    }


}
