/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author BedirTapkan
 */
public class BMIPanel extends JPanel {

    private JLabel heightLabel, weightLabel, BMILabel, resultLabel;
    private JTextField height, weight;
    private JButton Tournoument,Single;
// -----------------------------------------------------------------
//  Sets up the GUI.
// -----------------------------------------------------------------

    public BMIPanel() {
//create labels for the height and weight textfields
        heightLabel = new JLabel("Your height in inches: ");
        weightLabel = new JLabel("Your weight in pounds: ");
//create a "this is your BMI" label
        BMILabel = new JLabel("this is your BMI");
//create a result label to hold the BMI value
        resultLabel = new JLabel(" BMI ");
//create a JTextField to hold the person's height in inches
        height = new JTextField("      ");
        weight = new JTextField("      ");      
//create a JTextField to hold the person's weight in pounds
//create a button to press to calculate BMI
        Tournoument = new JButton("Calculate");
//create a BMIListener and make it listen for the button to be pressed
        Tournoument.addActionListener(new BMIListener());
//add the height label and height textfield to the panel
        add(heightLabel);
        add(height);
//add the weight label and weight textfield to the panel 
        add(weightLabel);
        add(weight);
//add the button to the panel
        add(calculate);
//add the BMI label to the panel
        add(BMILabel);
//add the label that holds the result to the panel
        add(resultLabel);
//set the size of the panel to the WIDTH and HEIGHT constants
        setPreferredSize(new Dimension(300, 200));
        setBackground(Color.ORANGE);
//set the color of the panel to whatever you choose
    }
// **************************************************************
//  Represents an action listener for the calculate button.
// **************************************************************

    private class BMIListener implements ActionListener {
// ---------------------------------------------
//  Compute the BMI when the button is pressed
// ---------------------------------------------

        public void actionPerformed(ActionEvent event) {
            String heightText, weightText;
            int heightVal, weightVal;
            double bmi;
            //get the text from the height and weight textfields
            heightText = height.getText();
            weightText = weight.getText();
            //Use Integer.parseInt to convert the text to integer values
            heightVal = Integer.parseInt(heightText); 
            weightVal = Integer.parseInt(weightText); 
            //Calculate the bmi = 703 * weight in pounds / (height in inches)^2
            //string.
            bmi = 703 * weightVal / (heightVal)^2;
            //Put result in result label.
            resultLabel.setText(Double.toString(bmi));
        }
    }
    
    
}
