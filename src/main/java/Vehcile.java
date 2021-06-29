import java.util.Date;

abstract class Vehcile {
    private int Id;
    private String Brand;

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

    public Date getFirstRegistrationDate() {
        return FirstRegistrationDate;
    }

    public void setFirstRegistrationDate(Date firstRegistrationDate) {
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

    public void setNumberPlate(String numberPlate) {
        NumberPlate = numberPlate;
    }

    private String Model;
    private Date FirstRegistrationDate;
    private int HorsePower;
    private Double Price;
    private int Seats;
    private Double TaxRate;
    private String NumberPlate;



}
