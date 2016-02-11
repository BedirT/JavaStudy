/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votecounter;

import javax.swing.JFrame;

/**
 *
 * @author BedirTapkan
 */
public class VoteCounter {

    // -------------------------------------------- // Creates the main program frame.
// --------------------------------------------
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new VoteCounterPanel());
        frame.pack();
        frame.setVisible(true);

    }
}
