/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package blobhunter;

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
public class BlobHunterPane extends JPanel {
    private int a;
    private BlobHunterGrid lbg = new BlobHunterGrid(20, 40);
    //private MineHunterControls lbc = new MineHunterControls(new colorListener());
    
    /**
     *
     */
    public BlobHunterPane(){
        
            setLayout(new BorderLayout());
    	    setPreferredSize(new Dimension(700, 700));
            add(lbg,BorderLayout.CENTER);
            //add(lbc, BorderLayout.WEST);
            
    }

    
}

