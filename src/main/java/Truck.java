import java.time.LocalDate;

public class Truck extends Vehcile{
    Double TaxRate = 1.5;
    Double taxPrice = TaxRate * getPrice() + (getSeats()* 500);


    public Truck(String brand, String model, LocalDate firstRegistrationDate, int horsePower, Double price, int seats, String numberPlate) {
        super(brand, model, firstRegistrationDate, horsePower, price, seats, numberPlate);
    }
}
