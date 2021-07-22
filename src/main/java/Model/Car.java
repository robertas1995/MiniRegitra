package Model;

import Model.Vehicle;

import java.time.LocalDate;

public class Car extends Vehicle {
     private final double taxMultiplier = 1;



     public Car(String brand, String model, LocalDate firstRegistrationDate, int horsePower, Double price, int seats, String numberPlate) {
          super(brand, model, firstRegistrationDate, horsePower, price, seats, numberPlate);
     }

     @Override
     public double calculateTax() {
          return super.calculateTax()*taxMultiplier;
     }
}
