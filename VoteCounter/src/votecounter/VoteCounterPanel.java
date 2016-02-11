/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votecounter;

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

/**
 *
 * @author BedirTapkan
 */
public class VoteCounterPanel extends JPanel {

    private int votesForJack;
    private JButton buttonJack;
    private JLabel labelJack;
    private int votesForSam;
    private JButton buttonSam;
    private JLabel labelSam;
    
// ------------------------------------------------ // Constructor: Sets up the GUI.
// ------------------------------------------------

    public VoteCounterPanel() {
        votesForJack = 0;
        buttonJack = new JButton("Vote for Jack");
        buttonJack.addActionListener(new JoeButtonListener());
        labelJack = new JLabel("Votes for Jack: " + votesForJack);
        add(buttonJack);
        add(labelJack);
        
        votesForSam = 0;
        buttonSam = new JButton("Vote for Sam");
        buttonSam.addActionListener(new SamButtonListener());
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        add(buttonSam);
        add(labelSam);
        
        setPreferredSize(new Dimension(300, 80));
        setBackground(Color.cyan);
        
}
// **************************************************
// Represents a listener for button push (action) events
// **************************************************

     private class JoeButtonListener implements ActionListener {
//--------------------------------------------- // Updates the counter and label 
         //when Vote for Joe // button is pushed //-----------------

         public void actionPerformed(ActionEvent event) {

             votesForJack++;
             labelJack.setText("Votes for Jack: " + votesForJack);

         }
     }
    
     private class SamButtonListener implements ActionListener {
//--------------------------------------------- // Updates the counter and label 
         //when Vote for Joe // button is pushed //-----------------

         public void actionPerformed(ActionEvent event) {

             votesForSam++;
             labelSam.setText("Votes for Sam: " + votesForSam);

         }
     }
     
}

