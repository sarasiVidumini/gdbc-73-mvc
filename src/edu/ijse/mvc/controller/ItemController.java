/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.model.ItemModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sarasi-vidumini
 */
public class ItemController {
   
     
     private ItemModel itemModel = new ItemModel();
     
    /**
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     * @throws SQLException
     */
    public ArrayList<ItemDto> getAll() throws ClassNotFoundException, SQLException{
         ArrayList<ItemDto> resp = itemModel.getAll();
         return resp;
     }
 }

