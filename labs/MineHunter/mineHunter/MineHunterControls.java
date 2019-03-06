/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minehunter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author timberlinepluska
 */
public class MineHunterControls extends JPanel {
    
    private JButton colorClicked;
    private Color pegColor;
    
    /**
     *
     * @param a
     */
    public MineHunterControls(ActionListener a){
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(1,5));
        
    	setPreferredSize(new Dimension(100, 800));

        JLabel zeroMine = new JLabel("0 Mines");
        zeroMine.setForeground(Color.black);
        JPanel zeroMinePanel = new JPanel();
        zeroMinePanel.setBackground(Color.white);
        zeroMinePanel.add(zeroMine); 
        zeroMinePanel.setPreferredSize(new Dimension(100,30));
        add(zeroMinePanel);
        
        JLabel oneMine = new JLabel("1 Mine");
        oneMine.setForeground(Color.black);
        JPanel oneMinePanel = new JPanel();
        oneMinePanel.setBackground(Color.gray);
        oneMinePanel.add(oneMine); 
        oneMinePanel.setPreferredSize(new Dimension(100,30));
        add(oneMinePanel);
        
        JLabel twoMine = new JLabel("2 Mines");
        oneMine.setForeground(Color.black);
        JPanel twoMinePanel = new JPanel();
        twoMinePanel.setBackground(Color.green);
        twoMinePanel.add(twoMine); 
        twoMinePanel.setPreferredSize(new Dimension(100,30));
        add(twoMinePanel);
        
        JLabel threeMine = new JLabel("3 Mines");
        threeMine.setForeground(Color.black);
        JPanel threeMinePanel = new JPanel();
        threeMinePanel.setBackground(Color.yellow);
        threeMinePanel.add(threeMine); 
        threeMinePanel.setPreferredSize(new Dimension(100,30));
        add(threeMinePanel);
        
        JLabel fourMine = new JLabel("4 Mines");
        fourMine.setForeground(Color.black);
        JPanel fourMinePanel = new JPanel();
        fourMinePanel.setBackground(Color.pink);
        fourMinePanel.add(fourMine); 
        fourMinePanel.setPreferredSize(new Dimension(100,30));
        add(fourMinePanel);
        
        JLabel fiveMine = new JLabel("5 Mines");
        fiveMine.setForeground(Color.black);
        JPanel fiveMinePanel = new JPanel();
        fiveMinePanel.setBackground(Color.blue);
        fiveMinePanel.add(fiveMine); 
        fiveMinePanel.setPreferredSize(new Dimension(100,30));
        add(fiveMinePanel);
        
        JLabel sixMine = new JLabel("6 Mines");
        sixMine.setForeground(Color.black);
        JPanel sixMinePanel = new JPanel();
        sixMinePanel.setBackground(Color.red);
        sixMinePanel.add(sixMine); 
        sixMinePanel.setPreferredSize(new Dimension(100,30));
        add(sixMinePanel);
        
        JLabel sevenMine = new JLabel("7 Mines");
        sevenMine.setForeground(Color.black);
        JPanel sevenMinePanel = new JPanel();
        sevenMinePanel.setBackground(Color.cyan);
        sevenMinePanel.add(sevenMine); 
        sevenMinePanel.setPreferredSize(new Dimension(100,30));
        add(sevenMinePanel);
        
        JLabel eightMine = new JLabel("8 Mine");
        eightMine.setForeground(Color.white);
        JPanel eightMinePanel = new JPanel();
        eightMinePanel.setBackground(Color.black);
        eightMinePanel.add(eightMine); 
        eightMinePanel.setPreferredSize(new Dimension(100,30));
        add(eightMinePanel);
        
        JButton resetButton = new JButton();
        resetButton.setText("Reset");
        resetButton.addActionListener(a);
        add(resetButton);
        
    }
    
    /**
     *
     * @param s
     * @return
     */
    public int getButtonAction(JButton s){
        
        if(s.getText().equals("Reset")){
            return 0;
        }
        return 0;
    }
    
      
}
