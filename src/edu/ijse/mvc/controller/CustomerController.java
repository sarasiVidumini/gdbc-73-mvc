/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.model.CustomerModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sarasi-vidumini
 */
public class CustomerController {
    private CustomerModel customerModel = new CustomerModel();
    
    
    
    public ArrayList<CustomerDto> getAll() throws ClassNotFoundException, SQLException{
         ArrayList<CustomerDto> resp = customerModel.getAll();
         return resp;
     }
}
