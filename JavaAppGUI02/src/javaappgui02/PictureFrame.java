/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaappgui02;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;


/**
 *
 * @author iektm1-12
 */
public class PictureFrame extends JFrame {
   
    JComboBox PicSelect;
    JLabel JlbPick;
    
    PictureFrame(){
       super();
       createGUI();
    }
    
    PictureFrame(String t){
         super(t);
        createGUI();
    }
    
    private void createGUI(){
         String path = System.getProperty("user.dir");
         setSize(250, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        DefaultComboBoxModel dlm = new DefaultComboBoxModel();
        dlm.addElement("Bird.gif");
        dlm.addElement("Cat.gif");
        dlm.addElement("Dog.gif");
        dlm.addElement("Pig.gif");
        dlm.addElement("Rabbit.gif");
        
        PicSelect = new JComboBox(dlm);
        JlbPick =  new JLabel("");
        ImageIcon im= new ImageIcon(path+"/resources/images/Bird.gif");
        ImageIcon imscaled = new ImageIcon(im.getImage().getScaledInstance(250,250,Image.SCALE_SMOOTH));
        JlbPick.setIcon(imscaled);
        
        
        
        
        
        
        
        
        c.gridx=0;
        c.gridy=0;
        c.anchor = GridBagConstraints.PAGE_START;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx =1.0;
        add(PicSelect,c);
        
        
        c.gridx=0;
        c.gridy=1;
        c.gridheight=3;
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.BOTH;
        c.weightx =1.0;
        c.weighty  =1.0;
        add(JlbPick,c);
        
        
        

        
        
        
    }
    
    
}
