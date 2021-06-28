 package Algoritma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tiket_Bioskop {
    private JPanel rootpanel;
    private JList list1;
    private JComboBox comboxgenre;
    private JComboBox comboxpaket;
    private JList list2;
    private JTextField textharga;
    private JTextField textjumlah;
    private JTextField textbayar;
    private JTextField textnama;
    private JTextField textnomor;
    private JTextField textpaket;
    private JButton buttonoke;
    private JTextField labelnama;
    private JTextField labelnogenre;
    private JTextField labelgenre;
    private JTextField labelnopaket;
    private JTextField labelpaket;
    private JTextField labeljumorang;
    private JTextField labelharga;
    private JTextField labeltotbayar;
    private JTextField labelantrian;
    private JButton checkButton;
    private JTextField labelantrian2;
    private JTable table1;


    public Tiket_Bioskop() {
        comboxgenre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboxgenre.getSelectedItem().equals("1")) {
                    textharga.setText("25000");
                } else if (comboxgenre.getSelectedItem().equals("2")) {
                    textharga.setText("30000");
                } else if (comboxgenre.getSelectedItem().equals("3")) {
                    textharga.setText("35000");
                } else if (comboxgenre.getSelectedItem().equals("4")) {
                    textharga.setText("25000");
                } else if (comboxgenre.getSelectedItem().equals("5")) {
                    textharga.setText("35000");
                } else if (comboxgenre.getSelectedItem().equals("6")) {
                    textharga.setText("25000");
                }
            }
        });
        buttonoke.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textnama.getText();
                String nomorgenre = textnomor.getText();
                String nomorpaket = textpaket.getText();
                String harga = textharga.getText();
                String jumlah = textjumlah.getText();
                String bayar = textbayar.getText();

                DataPenonton dape = new DataPenonton();
                dape.setNama(nama);
                dape.setNomorgenre(nomorgenre);
                dape.setNomorpaket(nomorpaket);
                dape.setJumlahorang(jumlah);
                dape.setHarga(harga);
                dape.setTotalbayar(bayar);

                labelnama.setText("Nama : " + dape.getNama());
                labelnogenre.setText("Nomor Genre : " + dape.getNomorgenre());
                labelgenre.setText("Genre : " + dape.getGenre());
                labelnopaket.setText("Nomor Paket : " + dape.getNomorpaket());
                labeljumorang.setText("Jumlah Orang : " + dape.getJumlahorang());
                labelpaket.setText("Paket : " + dape.getPaket());
                labelharga.setText("Harga : " + dape.getHarga());
                labeltotbayar.setText("Total Bayar : " + dape.getTotalbayar());
                labelantrian.setText("Antrian : " + dape.getAntrian());
                labelantrian2.setText(dape.getAntrian2());
            }
        });
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double hartik = Double.parseDouble(textharga.getText());
                double jumor = Double.parseDouble(textjumlah.getText());
                double bayar = hartik * jumor;
                textbayar.setText("Rp." + bayar);
            }
        });
    }
    public JPanel getRootpanel(){
        return rootpanel;
    }
}
