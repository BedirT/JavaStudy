/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author BedirTapkan
 */


public class action extends JPanel {

    private JButton Tournoument,Single,EXIT;

    public action() {

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        
        Tournoument = new JButton("Tournoument");
        Single = new JButton("Single Game"); 
        EXIT = new JButton("EXIT");
        
        Tournoument.addActionListener(new Listener());
        Single.addActionListener(new Listener());
        EXIT.addActionListener(new Listener());
        
        Tournoument.add(p1);
        Single.add(p2);
        
        add(p1);
        
        setPreferredSize(new Dimension(300, 200));
        setBackground(Color.GRAY);
    }

    private class Listener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            
            if(event.getSource() == Tournoument){
                
            }else if (event.getSource() == Single){
                
            }else if (event.getSource() == EXIT){
                
            }
                
        }
    }
    
    
}
