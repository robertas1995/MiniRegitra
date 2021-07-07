import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class RegitraFrame {
    private static final ArrayList<Vehcile> allVehcile = new ArrayList<Vehcile>(){{
        System.out.println(allVehcile);

    }};
    private static final ArrayList<Vehcile> allCar = new ArrayList<Vehcile>(){{

    }};
    private static final ArrayList<Vehcile> motorcycle = new ArrayList<Vehcile>(){{

    }};





        public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Regitra");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,800);
        frame.setBackground(Color.getHSBColor(244, 244, 244));
        frame.setLayout(new GridLayout(10, 1));


        JLabel pavadinimas = new JLabel("transporo registracija");
        JPanel nameWindow = new JPanel();
        frame.getContentPane().add(BorderLayout.PAGE_START,nameWindow);
        JLabel pasirinkimas1 = new JLabel("Pasirinkite");
        JList sarasas = new JList();
        JPanel listPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.AFTER_LINE_ENDS,listPanel);
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
        JPanel pasirinkimas2 = new JPanel(new GridLayout(1,1));
        pasirinkimas2.add(pasirinkimas1);
        pasirinkimas2.add(RadioMotorcycle);
        pasirinkimas2.add(car);
        pasirinkimas2.add(truck);
        pasirinkimas2.add(superCar);
        frame.getContentPane().add(BorderLayout.LINE_START,pasirinkimas2);

        String [] marke = {"BMW", "Volkswagen", "Audi", "Pegeo", "ACURA", "Honda", "Opel","Fiat", "Renault", "Ford", "GAZ", "HYUNDAI"};
        JLabel markesLable = new JLabel("Pasirinkite marke");
        JComboBox<String> markeComboBox = new JComboBox<>(marke);
        markeComboBox.setSelectedIndex(1);
        String makeString = markeComboBox.getItemAt(markeComboBox.getSelectedIndex()).toString();
        JTextField modelis = new JTextField("modelis",9);
        JPanel markesPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.WEST,markesPanel);
        markesPanel.add(markesLable);
        markesPanel.add(markeComboBox);
        markesPanel.add(modelis);
        JTextField metai = new JTextField(6);
        JTextField menesis = new JTextField(6);
        JTextField diena = new JTextField(6);




//
        JPanel pagaminimoData = new JPanel();
        JLabel datosUzrasas = new JLabel("Iveskite pagaminimo data");
        frame.getContentPane().add(BorderLayout.LINE_START,pagaminimoData);
        pagaminimoData.add(datosUzrasas);
        pagaminimoData.add(metai);
        pagaminimoData.add(menesis);
        pagaminimoData.add(diena);
        nameWindow.add(pavadinimas);
        JLabel horsePowerLabel = new JLabel("Arklio galios");
        JTextField horsePowerTextField = new JTextField("hp",10);
        JPanel horsePowerPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.WEST,horsePowerPanel);
        horsePowerPanel.add(horsePowerLabel);
        horsePowerPanel.add(horsePowerTextField);
        JLabel priceLable = new JLabel("Iveskite Kaina");
        JTextField priceTextField = new JTextField(10);
        JPanel pricePanel = new JPanel();
        frame.getContentPane().add(BorderLayout.WEST,pricePanel);
        pricePanel.add(priceLable);
        pricePanel.add(priceTextField);
        JLabel seatsLable = new JLabel("sedimos vietos");
        JTextField seats = new JTextField(5);
        JPanel seatsPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.WEST,seatsPanel);
        seatsPanel.add(seatsLable);
        seatsPanel.add(seats);
        JLabel numberPlate = new JLabel("valst. Numeriai");
        JTextField number = new JTextField(10);
        JPanel numberPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.WEST,numberPanel);
        numberPanel.add(numberPlate);
        numberPanel.add(number);
        JButton Find = new JButton();
        Find.setText("Rasti");
        Find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame carListFrame = new JFrame();
                carListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                carListFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                carListFrame.setSize(700,800);
                carListFrame.setBackground(Color.getHSBColor(244, 244, 244));
                carListFrame.setLayout(new GridLayout(20, 1));
                carListFrame.setVisible(true);




        }});
        Find.setSize(2,6);
        JButton register = new JButton();

        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        FileWriter fw = null;
                        BufferedWriter bw = null;
                        try {
                            LocalDate InputDate = LocalDate.of(Integer.parseInt(metai.getText()),Integer.parseInt(menesis.getText()),Integer.parseInt(diena.getText()));
                         if (car.isSelected()){
                        Vehcile car = new Car(makeString, modelis.getText(),InputDate ,Integer.parseInt(horsePowerTextField.getText()),Double.parseDouble(priceTextField.getText()),Integer.parseInt(seats.getText()),numberPlate.getText());
                         allCar.add(car);
                       System.out.println(car);
                        }

                            Vehcile vehcile = new Vehcile(makeString, modelis.getText(),InputDate, Integer.parseInt(horsePowerTextField.getText()),Double.parseDouble(priceTextField.getText()),Integer.parseInt(seats.getText()),numberPlate.getText());
                            allVehcile.add(vehcile);
                            System.out.println(vehcile);
                            fw = new FileWriter("Regitros Sarasas.csv");
                            bw = new BufferedWriter(fw);
                            bw.write("Marke; modelis; reg.data; arklio galios; Kaina; Sedines; Valst.nr\n");

                            for (Vehcile c: allVehcile) {
                                bw.write(String.format("%s;%s;%s;%s;%s;%s;%s\n", c.getBrand(), c.getModel(), c.getFirstRegistrationDate(), c.getHorsePower(), c.getPrice(), c.getSeats(), c.getNumberPlate()));

                            } }
                        catch (Exception exc) {
                            System.out.println(String.format("Ivyko klaida: %s", exc.getMessage()));
                        }
                        finally {
                            try {
                                bw.close();
                            } catch (IOException ioException) {
                                ioException.printStackTrace();
                            }
                        }
                    }
                });




            }
        });

        register.setText("Registruoti");
        register.setSize(2,6);
        JPanel buttons = new JPanel();
        frame.getContentPane().add(BorderLayout.WEST,buttons);
        buttons.add(Find);
        buttons.add(register);
        frame.setVisible(true);
    }

}
