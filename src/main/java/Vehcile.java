import java.util.Date;

abstract class Vehcile {
    private int Id;
    private String Brand;
    private String Model;
    private Date FirstRegistrationDate;
    private int HorsePower;

    public int getId() {
        return Id;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public Date getFirstRegistrationDate() {
        return FirstRegistrationDate;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public Double getPrice() {
        return Price;
    }

    public int getSeats() {
        return Seats;
    }

    public Double getTaxRate() {
        return TaxRate;
    }

    public String getNumberPlate() {
        return NumberPlate;
    }

    private Double Price;
    private int Seats;
    private Double TaxRate;
    private String NumberPlate;

    public Double CalculateTax() {
        return CalculateTax();
    }

}
