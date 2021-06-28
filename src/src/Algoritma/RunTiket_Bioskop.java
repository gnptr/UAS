package Algoritma;

import javax.swing.*;

public class RunTiket_Bioskop {
        public static void main(String[] args) {
                JFrame jFrame = new JFrame("DATA MAHASISWA");
                jFrame.setContentPane(new Tiket_Bioskop().getRootpanel());
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.setLocationRelativeTo(null);
                jFrame.setSize(500, 300);
                jFrame.setVisible(true);

        }
}
