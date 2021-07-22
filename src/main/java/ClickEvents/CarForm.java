package ClickEvents;

import Model.Vehicle;

import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.IOException;
import java.util.ArrayList;

public class CarForm {

    public static void doRegisterButton(ArrayList<Vehicle> array) throws IOException {

        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("MasinuFailas.csv");
            bw = new BufferedWriter(fw);

            bw.write("Brand;Model;FirstRegistrationDate;HorsePower;Price;Seats;TaxRate;numberPlate\n");

            for (Vehicle v: array){
                bw.write(String.format("%s;%s;%s;%s;%s;%s;%s;%s\n",v.getBrand(),v.getModel(),v.getFirstRegistrationDate(),v.getHorsePower(),v.getPrice(),v.getSeats(),v.calculateTax(),v.getNumberPlate()));
            }
        } catch (Exception exc) {
            System.out.println(String.format("Ivyko klaida: %s", exc.getMessage()));
        } finally {
            bw.close();
        }
    }


}