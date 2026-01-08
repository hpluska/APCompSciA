/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package blobhunter1d;

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
public class BlobHunterPane1D extends JPanel {
    private int a;
    private int squares = 50;
    private BlobHunterGrid1D lbg = new BlobHunterGrid1D(50, 20);
    
    /**
     *
     */
    public BlobHunterPane1D(){
        
            setLayout(new BorderLayout());
    	    setPreferredSize(new Dimension(squares*50, 50));
            add(lbg,BorderLayout.CENTER);
            
    }

    
}


