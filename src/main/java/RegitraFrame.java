import ClickEvents.CarForm;
import Model.Car;
import Model.Truck;
import Model.Vehicle;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;


public class RegitraFrame {

    private static final ArrayList<Vehicle> allCarList = new ArrayList<Vehicle>();

    private static final ArrayList<Vehicle> motorcycleList = new ArrayList<Vehicle>();

    private static final ArrayList<Vehicle> truckList = new ArrayList<Vehicle>();

    private static final ArrayList<Vehicle> superCarList = new ArrayList<Vehicle>();


    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Regitra");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 800);
        frame.setBackground(Color.getHSBColor(244, 244, 244));
        frame.setLayout(new GridLayout(10, 1));


        JLabel pavadinimas = new JLabel("transporo registracija");
        JPanel nameWindow = new JPanel();
        frame.getContentPane().add(BorderLayout.PAGE_START, nameWindow);
        JLabel pasirinkimas1 = new JLabel("Pasirinkite");
        JList sarasas = new JList();
        JPanel listPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.AFTER_LINE_ENDS, listPanel);
        listPanel.add(sarasas);

        JRadioButton RadioMotorcycle = new JRadioButton("Motociklas");
        JRadioButton car = new JRadioButton("Automobilis");
        JRadioButton truck = new JRadioButton("Sunkvezimis");
        JRadioButton superCar = new JRadioButton("supercar");
        ButtonGroup group = new ButtonGroup();
        group.add(RadioMotorcycle);
        group.add(car);
        group.add(truck);
        group.add(superCar);
        JPanel pasirinkimas2 = new JPanel(new GridLayout(1, 1));
        pasirinkimas2.add(pasirinkimas1);
        pasirinkimas2.add(RadioMotorcycle);
        pasirinkimas2.add(car);
        pasirinkimas2.add(truck);
        pasirinkimas2.add(superCar);
        frame.getContentPane().add(BorderLayout.LINE_START, pasirinkimas2);

        String[] marke = {"BMW", "Volkswagen", "Audi", "Pegeo", "ACURA", "Honda", "Opel", "Fiat", "Renault", "Ford", "GAZ", "HYUNDAI"};
        JLabel markesLable = new JLabel("Pasirinkite marke");
        JComboBox<String> markeComboBox = new JComboBox<>(marke);
        String makeString = marke[markeComboBox.getSelectedIndex()];
        JTextField modelis = new JTextField("modelis", 9);
        JPanel markesPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.WEST, markesPanel);
        markesPanel.add(markesLable);
        markesPanel.add(markeComboBox);
        markesPanel.add(modelis);
        JTextField metai = new JTextField(6);
        JTextField menesis = new JTextField(6);
        JTextField diena = new JTextField(6);


//
        JPanel pagaminimoData = new JPanel();
        JLabel datosUzrasas = new JLabel("Iveskite pagaminimo data");
        frame.getContentPane().add(BorderLayout.LINE_START, pagaminimoData);
        pagaminimoData.add(datosUzrasas);
        pagaminimoData.add(metai);
        pagaminimoData.add(menesis);
        pagaminimoData.add(diena);
        nameWindow.add(pavadinimas);
        JLabel horsePowerLabel = new JLabel("Arklio galios");
        JTextField horsePowerTextField = new JTextField(10);
        JPanel horsePowerPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.WEST, horsePowerPanel);
        horsePowerPanel.add(horsePowerLabel);
        horsePowerPanel.add(horsePowerTextField);
        JLabel priceLable = new JLabel("Iveskite Kaina");
        JTextField priceTextField = new JTextField(10);
        JPanel pricePanel = new JPanel();
        frame.getContentPane().add(BorderLayout.WEST, pricePanel);
        pricePanel.add(priceLable);
        pricePanel.add(priceTextField);
        JLabel seatsLable = new JLabel("sedimos vietos");
        JTextField seats = new JTextField(5);
        JPanel seatsPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.WEST, seatsPanel);
        seatsPanel.add(seatsLable);
        seatsPanel.add(seats);
        JLabel numberPlate = new JLabel("valst. Numeriai");
        JTextField number = new JTextField(10);
        JPanel numberPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.WEST, numberPanel);
        numberPanel.add(numberPlate);
        numberPanel.add(number);
        JButton Find = new JButton();
        Find.setText("Rasti");
        Find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame carListFrame = new JFrame();
                carListFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                carListFrame.setSize(700, 800);
                carListFrame.setBackground(Color.getHSBColor(244, 244, 244));

                String col[] = {"Id", "Make", "Model", "First_registration_date", "Horse Power", "Price", "Seats", "Tax", "Plate_number"};
                DefaultTableModel tableModel = new DefaultTableModel(col, 0);
                JTable table = new JTable(tableModel);
                JScrollPane sp = new JScrollPane(table);
              
                carListFrame.add(sp);

                for (Vehicle x : allCarList) {
                    Object[] objs = {x.getId(), x.getBrand(), x.getModel(), x.getFirstRegistrationDate(), x.getHorsePower(), x.getPrice(), x.getSeats(), x.calculateTax(), x.getNumberPlate()};
                    tableModel.addRow(objs);

                }
                carListFrame.setVisible(true);



            }
        });
        Find.setSize(2, 6);
        JButton register = new JButton();


        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Data input conversion


                LocalDate InputDate = LocalDate.of(Integer.parseInt(metai.getText()), Integer.parseInt(menesis.getText()), Integer.parseInt(diena.getText()));
                if (car.isSelected()) {
                    Vehicle car = new Car(marke[markeComboBox.getSelectedIndex()], modelis.getText(), InputDate, Integer.parseInt(horsePowerTextField.getText()), Double.parseDouble(priceTextField.getText()), Integer.parseInt(seats.getText()), numberPlate.getText());
                    allCarList.add(car);
                }

                if (truck.isSelected()) {
                    Vehicle truck = new Truck(markeComboBox.getItemAt(markeComboBox.getSelectedIndex()), modelis.getText(), InputDate, Integer.parseInt(horsePowerTextField.getText()), Double.parseDouble(priceTextField.getText()), Integer.parseInt(seats.getText()), numberPlate.getText());
                    truckList.add(truck);

                }
                if (RadioMotorcycle.isSelected()) {
                    Vehicle motorcycle = new Truck(markeComboBox.getItemAt(markeComboBox.getSelectedIndex()), modelis.getText(), InputDate, Integer.parseInt(horsePowerTextField.getText()), Double.parseDouble(priceTextField.getText()), Integer.parseInt(seats.getText()), numberPlate.getText());
                    motorcycleList.add(motorcycle);

                }
                if (superCar.isSelected()) {
                    Vehicle superCarai = new Truck(markeComboBox.getItemAt(markeComboBox.getSelectedIndex()), modelis.getText(), InputDate, Integer.parseInt(horsePowerTextField.getText()), Double.parseDouble(priceTextField.getText()), Integer.parseInt(seats.getText()), numberPlate.getText());
                    superCarList.add(superCarai);

                }
                try {
                    CarForm.doRegisterButton(allCarList);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                System.out.println("Paklikinau REGISTER mygtuka");


            }

        });


        register.setText("Registruoti");
        register.setSize(2, 6);
        JPanel buttons = new JPanel();
        frame.getContentPane().add(BorderLayout.WEST, buttons);
        buttons.add(Find);
        buttons.add(register);
        frame.setVisible(true);
    }

}
