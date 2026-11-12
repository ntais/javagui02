/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaappgui02;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.ScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author iektm1-12
 */
public class MainFrame extends JFrame {

    JLabel jl1, jl2, jl3, jl4;
    JTextField tf1, tf2;
    JList listSports;
    JRadioButton jrb1, jrb2;
    JCheckBox jcb1, jcb2, jcb3,jcb4;
    JButton b1, b2, b3;

    MainFrame() {
        super();
        createGUI();
    }

    MainFrame(String t) {
        super(t);
        createGUI();
    }

    private void createGUI() {
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JPanel upLeftP = new JPanel();
        upLeftP.setLayout(new GridLayout(2, 2));

        jl1 = new JLabel("Ετικέτα 1");
        jl2 = new JLabel("Ετικέτα 2");
        tf1 = new JTextField(12);
        tf2 = new JTextField(12);

        
        
        upLeftP.add(jl1);
        upLeftP.add(tf1);
        upLeftP.add(jl2);
        upLeftP.add(tf2);

        DefaultListModel dlm = new DefaultListModel();
        dlm.addElement("Swimming");
        dlm.addElement("Running");
        dlm.addElement("high jump");
        dlm.addElement("a1");
        dlm.addElement("a2");
        dlm.addElement("a3");
        listSports = new JList(dlm);
        
        listSports.setLayoutOrientation(JList.VERTICAL);
        listSports.setVisibleRowCount(4);
        ScrollPane sp = new ScrollPane();
        sp.add(listSports);
        
        JPanel fyloP = new JPanel();
        fyloP.setLayout(new GridLayout(2,2));


        jl3 = new JLabel("Φύλλο");
      
        jrb1 = new JRadioButton("Άνδρας");
        jrb2 = new JRadioButton("Γυναίκα");
        
        fyloP.add(jl3);
        fyloP.add(jrb1);
        fyloP.add(new JLabel(" "));
        fyloP.add(jrb2);
        
        JPanel glossaP = new JPanel();
        glossaP.setLayout(new GridLayout(4,2));

        jl4 = new JLabel("ΓΛ.ΠΡ/σμου:");
        jcb1 = new JCheckBox("JAVA");
        jcb2 = new JCheckBox("PYTHON");
        jcb3 = new JCheckBox("PHP");
        jcb4 = new JCheckBox("C++");
        
        glossaP.add(jl4);
        glossaP.add(jcb1);
        glossaP.add(new JLabel(" "));
        glossaP.add(jcb2);
        glossaP.add(new JLabel(" "));
        glossaP.add(jcb3);
        glossaP.add(new JLabel(" "));
        glossaP.add(jcb4);
        
        JPanel downButtonP = new JPanel();
        downButtonP.setLayout(new GridLayout(1, 3));
        b1 = new JButton("Φύλο");
        b2 = new JButton("Γλώσσα");
        b3 = new JButton("Κλείσιμο");
        downButtonP.add(b1);
        downButtonP.add(b2);
        downButtonP.add(b3);

        ButtonGroup bj = new ButtonGroup();
        //<------------------ what my guy next to me said
        bj.add(jrb1);
        bj.add(jrb2);
        jrb2.setSelected(true);

        c.insets = new Insets(5, 5, 5, 5);

        c.anchor = GridBagConstraints.LINE_START;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight=2;
        add(upLeftP,c);

        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 2;
        add(sp, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridheight = 2;
        add(fyloP, c);
                
        c.gridx = 1;
        c.gridy = 2;
        c.gridheight = 2;
        add(glossaP, c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        c.gridheight = 1;
        add(downButtonP, c);
       // pack();
    }

    private void createGUIOld() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        jl1 = new JLabel("Ετικέτα 1");
        jl2 = new JLabel("Ετικέτα 2");
        tf1 = new JTextField(30);
        tf2 = new JTextField(30);

        String[] dm = {"Swimming", "Running", "high jump", "Horse riding"};
        listSports = new JList(dm);
        jl3 = new JLabel("Φύλλο");
        jl4 = new JLabel("ΓΛ.ΠΡ/σμου:");
        jrb1 = new JRadioButton("Άνδρας");
        jrb2 = new JRadioButton("Γυναίκα");

        jcb1 = new JCheckBox("JAVA");
        jcb2 = new JCheckBox("PYTHON");
        jcb3 = new JCheckBox("PHP");

        JPanel downButtonP = new JPanel();
        downButtonP.setLayout(new GridLayout(1, 3));
        b1 = new JButton("Φύλο");
        b2 = new JButton("Γλώσσα");
        b3 = new JButton("Κλείσιμο");
        downButtonP.add(b1);
        downButtonP.add(b2);
        downButtonP.add(b3);

        ButtonGroup bj = new ButtonGroup();
        //<------------------ what my guy next to me said
        bj.add(jrb1);
        bj.add(jrb2);
        jrb2.setSelected(true);

        c.insets = new Insets(5, 5, 5, 5);

        c.anchor = GridBagConstraints.LINE_START;
        c.gridx = 0;
        c.gridy = 0;
        add(jl1, c);

        c.gridx = 0;
        c.gridy = 1;
        add(jl2, c);

        c.gridx = 1;
        c.gridy = 0;
        add(tf1, c);

        c.gridx = 1;
        c.gridy = 1;
        add(tf2, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        c.gridheight = 3;
        c.fill = GridBagConstraints.BOTH;
        add(listSports, c);

        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.NONE;
        add(jl3, c);

        c.gridx = 1;
        c.gridy = 5;
        add(jrb1, c);

        c.gridx = 1;
        c.gridy = 6;
        add(jrb2, c);

        c.gridx = 0;
        c.gridy = 7;
        add(jl4, c);

        c.gridx = 1;
        c.gridy = 7;
        add(jcb1, c);

        c.gridx = 1;
        c.gridy = 8;
        add(jcb2, c);

        c.gridx = 1;
        c.gridy = 9;
        add(jcb3, c);

        c.gridx = 0;
        c.gridy = 10;
        c.gridwidth = 2;
        add(downButtonP, c);

        pack();
    }

}
