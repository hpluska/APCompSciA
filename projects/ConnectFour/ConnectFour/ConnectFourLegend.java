/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfourstudent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author timberlinepluska
 */
public class ConnectFourLegend extends JPanel {
    
    private JButton colorClicked;
    private Color pegColor;
    JLabel playerOne, playerTwo;
    
    /**
     *
     * @param a
     */
    public ConnectFourLegend(ActionListener a){
        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());
    	setPreferredSize(new Dimension(800, 80));
        Font f = new Font("Calibri",Font.BOLD,14);
        
        playerOne = new JLabel("Player 1");
        playerOne.setVerticalAlignment(JLabel.CENTER);
        playerOne.setHorizontalAlignment(JLabel.CENTER);
        playerOne.setForeground(Color.WHITE);
        playerOne.setBorder(BorderFactory.createLineBorder(Color.black));
        playerOne.setBackground(Color.RED);
        playerOne.setOpaque(true);
        playerOne.setFont(f);
        playerOne.setPreferredSize(new Dimension(100,50));
        add(playerOne);

        playerTwo = new JLabel("Player 2");
        playerTwo.setVerticalAlignment(JLabel.CENTER);
        playerTwo.setHorizontalAlignment(JLabel.CENTER);
        playerTwo.setForeground(Color.WHITE);
        playerTwo.setBorder(BorderFactory.createLineBorder(Color.black));
        playerTwo.setBackground(Color.BLUE);
        playerTwo.setOpaque(true);
        playerTwo.setFont(f);
        playerTwo.setPreferredSize(new Dimension(100,50));
        add(playerTwo);

        JButton resetButton = new JButton();
        resetButton.setText("Reset");
        resetButton.setPreferredSize(new Dimension(100,50));
        resetButton.addActionListener(a);
        add(resetButton);

    }
    
    /**
     *
     * @param s
     * @return
     */
    public int getButtonAction(JButton s){
        
            return 0;
    }
    
      
}
