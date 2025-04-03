/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;

import edu.ijse.mvc.view.CustomerView;
import edu.ijse.mvc.view.ItemView;

/**
 *
 * @author sarasi-vidumini
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        new ItemView().setVisible(true);
        new CustomerView().setVisible(true);
       
    }
    
}
