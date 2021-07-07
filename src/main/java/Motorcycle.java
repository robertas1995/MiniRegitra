import java.time.LocalDate;

public class Motorcycle extends Vehcile{
     Double TaxRate = 0.5;
     Double taxPrice = TaxRate * getPrice() + (getSeats()* 500);


     public Motorcycle(String brand, String model, LocalDate firstRegistrationDate, int horsePower, Double price, int seats, String numberPlate) {
          super(brand, model, firstRegistrationDate, horsePower, price, seats, numberPlate);
     }
}
