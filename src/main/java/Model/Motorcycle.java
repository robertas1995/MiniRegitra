package Model;

import Model.Vehicle;

import java.time.LocalDate;

public class Motorcycle extends Vehicle {
     private final double taxMultiplier = 0.5;



     public Motorcycle(String brand, String model, LocalDate firstRegistrationDate, int horsePower, Double price, int seats, String numberPlate) {
          super(brand, model, firstRegistrationDate, horsePower, price, seats, numberPlate);
     }

     @Override
     public double calculateTax() {
          return super.calculateTax()*taxMultiplier;
     }
}
