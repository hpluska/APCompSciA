/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minehunter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author timberlinepluska
 */
public class MineHunterPane extends JPanel {
    private int a;
    private MineHunterGrid mwg = new MineHunterGrid(20);
    private MineHunterControls mwc = new MineHunterControls(new colorListener());
    
    /**
     *
     */
    public MineHunterPane(){
        
            setLayout(new BorderLayout());
    	    setPreferredSize(new Dimension(800, 800));
            add(mwg,BorderLayout.CENTER);
            add(mwc, BorderLayout.WEST);
            
    }

    private class colorListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			a = mwc.getButtonAction((JButton) e.getSource());
                        mwg.doButtonAction(a);
		}
    }
    
}


