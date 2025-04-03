/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.CustomerDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sarasi-vidumini
 */
public class CustomerModel {
    public String saveCustomer(CustomerDto customerDto) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, customerDto.getCustId());
        statement.setString(2, customerDto.getCustTitle());
        statement.setString(3, customerDto.getCustName());
        statement.setString(4, customerDto.getDOB());
        statement.setDouble(5, customerDto.getSalary());
        statement.setString(6, customerDto.getCustAddress());
        statement.setString(7, customerDto.getCity());
        statement.setString(8, customerDto.getProvince());
        statement.setInt(9, customerDto.getPostalCode());
         
        return statement.executeUpdate() > 0 ? "Successfully Saved" : "Fail";
    }
    
    public String updateCustomer(CustomerDto customerDto) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Customer SET CustTitle = ?, CustName = ?, DOB = ?, Salary = ? , CustAddress = ? , City = ? , Province = ? , PostalCode = ?  WHERE CustId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, customerDto.getCustTitle());
        statement.setString(2, customerDto.getCustName());
        statement.setString(3, customerDto.getDOB());
        statement.setDouble(4, customerDto.getSalary());
        statement.setString(5, customerDto.getCustAddress());
        statement.setString(6, customerDto.getCity());
        statement.setString(7, customerDto.getProvince());
        statement.setInt(8, customerDto.getPostalCode());
        statement.setString(9, customerDto.getCustId());
        
         return statement.executeUpdate() > 0 ? "Successfully Updated" : "Fail";
         
    }
    
    
    public String deleteCustomer(String CustId) throws ClassNotFoundException, SQLException{
         Connection connection = DBConnection.getInstance().getConnection();
         String sql = "DELETE FROM Customer WHERE CustId = ?";
         PreparedStatement statement = connection.prepareStatement(sql);
         statement.setString(1, CustId);
         
         return statement.executeUpdate() > 0 ? "Successfully Deleted" : "Fail";
    }
    
    public CustomerDto searchCustomer(String CustId) throws ClassNotFoundException, SQLException{
         Connection connection = DBConnection.getInstance().getConnection();
         String sql = "SELECT * FROM Item WHERE CustId = ?";
         PreparedStatement statement = connection.prepareStatement(sql);
         statement.setString(1, CustId);
         
         ResultSet rst = statement.executeQuery();
         
         if(rst.next()){
             CustomerDto dto = new CustomerDto(rst.getString("CustId"), 
                     rst.getString("CustTitle"), rst.getString("CustName"),
                     rst.getString("DOB"), rst.getDouble("Salary"),
                     rst.getString("CustAddress") , rst.getString("City"),
                     rst.getString("Province"), rst.getInt("PostalCode"));
             
             return dto;
         }
         return null;
    }
    
    public ArrayList<CustomerDto> getAll() throws ClassNotFoundException, SQLException{
         Connection connection = DBConnection.getInstance().getConnection();
         String sql = "SELECT * FROM Customer";
         PreparedStatement statement = connection.prepareStatement(sql);
         
         ResultSet rst = statement.executeQuery();
         ArrayList<CustomerDto> customerDtos = new ArrayList<>();
         
         while (rst.next()) {            
             CustomerDto dto = new CustomerDto(rst.getString("CustId"), 
                     rst.getString("CustTitle"), rst.getString("CustName"),
                     rst.getString("DOB"), rst.getDouble("Salary"),
                     rst.getString("CustAddress") , rst.getString("City"),
                     rst.getString("Province"), rst.getInt("PostalCode"));
             customerDtos.add(dto);
         }
         return customerDtos;
     }
     
 }