/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import javax.swing.JFrame;

/**
 *
 * @author BedirTapkan
 */
public class BMI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("BMI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BMIPanel panel = new BMIPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}
