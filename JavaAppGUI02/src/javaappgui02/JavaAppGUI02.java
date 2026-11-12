/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaappgui02;

/**
 *
 * @author iektm1-12
 */
public class JavaAppGUI02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MainFrame mf = new MainFrame("My First Application");
    mf.setVisible(true);
    mf.setResizable(false);
    
    PictureFrame pf = new PictureFrame("Picture chooser");
    pf.setVisible(true);
    pf.setResizable(false);
    
    
    
    System.out.println(System.getProperty("user.dir"));
    }
}
