/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author BedirTapkan
 */



public class textAdded extends JPanel {
    
    private JTextField TextF;
    private JRadioButton Scissor,Paper,Rock;
    
    
    public textAdded() {
        
       TextF = new JTextField("             ");  
       add(TextF);
       Scissor = new JRadioButton("Scissor");
       Paper = new JRadioButton("Paper");
       Rock = new JRadioButton("Rock");
       
    }   
}
