/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javax.swing.JFrame;

/**
 *
 * @author BedirTapkan
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("action");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        action panel = new action();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    
}
