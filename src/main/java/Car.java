import java.time.LocalDate;

public class Car extends Vehcile{
     Double TaxRate = 1.0;
     Double taxPrice = TaxRate * getPrice() + (getSeats()* 500);



     public Car(String brand, String model, LocalDate firstRegistrationDate, int horsePower, Double price, int seats, String numberPlate) {
          super(brand, model, firstRegistrationDate, horsePower, price, seats, numberPlate);
     }
}
