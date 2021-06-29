import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class RegitraFrame {
    public static ArrayList<Vehcile> allVehcile = new ArrayList<Vehcile>(){{

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

        JRadioButton motorcycle = new JRadioButton("Motociklas");
        JRadioButton car = new JRadioButton("Automobilis");
        JRadioButton truck = new JRadioButton("Sunkvezimis");
        JRadioButton superCar = new JRadioButton("supercar");
        ButtonGroup group = new ButtonGroup();
        group.add(motorcycle);
        group.add(car);
        group.add(truck);
        group.add(superCar);
        JPanel pasirinkimas2 = new JPanel(new GridLayout(1,1));
        pasirinkimas2.add(pasirinkimas1);
        pasirinkimas2.add(motorcycle);
        pasirinkimas2.add(car);
        pasirinkimas2.add(truck);
        pasirinkimas2.add(superCar);
        frame.getContentPane().add(BorderLayout.LINE_START,pasirinkimas2);

        String [] marke = {"BMW", "Volkswagen", "Audi", "Pegeo", "ACURA", "Honda", "Opel","Fiat", "Renault", "Ford", "GAZ", "HYUNDAI"};
        JLabel markesLable = new JLabel("Pasirinkite marke");
        JComboBox<String> markeComboBox = new JComboBox<>(marke);
        markeComboBox.setSelectedIndex(1);
        JTextField modelis = new JTextField("modelis",9);
        JPanel markesPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.WEST,markesPanel);
        markesPanel.add(markesLable);
        markesPanel.add(markeComboBox);
        markesPanel.add(modelis);
        JTextField metai = new JTextField("YYYY",6);
        JTextField menesis = new JTextField("mm",6);
        JTextField diena = new JTextField("dd",6);
        JPanel pagaminimoData = new JPanel();
        JLabel datosUzrasas = new JLabel("Iveskite pagaminimo data");
        frame.getContentPane().add(BorderLayout.LINE_START,pagaminimoData);
        pagaminimoData.add(datosUzrasas);
        pagaminimoData.add(metai);
        pagaminimoData.add(menesis);
        pagaminimoData.add(diena);
        nameWindow.add(pavadinimas);
        JLabel hpLable = new JLabel("Arklio galios");
        JTextField hp = new JTextField("hp",10);
        JPanel hpPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.WEST,hpPanel);
        hpPanel.add(hpLable);
        hpPanel.add(hp);
        JLabel kainosLable = new JLabel("Iveskite Kaina");
        JTextField kaina = new JTextField(10);
        JPanel kainosPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.WEST,kainosPanel);
        kainosPanel.add(kainosLable);
        kainosPanel.add(kaina);
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
                String mkl1 = (modelis.getText());

            }

        });
        Find.setSize(2,6);
        JButton register = new JButton();
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
