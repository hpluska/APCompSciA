/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfourstudent;

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
public class ConnectFourPane extends JPanel {
    private int a;
    private ConnectFourGrid cfg = new ConnectFourGrid(7);
    private ConnectFourLegend cfl = new ConnectFourLegend(new buttonListener());
    
    /**
     *
     */
    public ConnectFourPane(){
        
            setLayout(new BorderLayout());
    	    setPreferredSize(new Dimension(600, 660));
            add(cfg,BorderLayout.NORTH);
            add(cfl, BorderLayout.CENTER);
     
    }

    private class buttonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			a = cfl.getButtonAction((JButton) e.getSource());
                        cfg.doButtonAction(a);
                        
		}
    }
    
    
}


