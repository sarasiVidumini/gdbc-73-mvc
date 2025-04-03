/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 * DTO class for Item details
 * @author sarasi-vidumini
 */
public class ItemDto {
    private String itemCode;
    private String description;
    private String packSize;
    private Double unitPrice;
    private int qoh;

    // Default constructor
    public ItemDto() {  
    }

    // Parameterized constructor
    public ItemDto(String itemCode, String description, String packSize, Double unitPrice, int qoh) {
        this.itemCode = itemCode;
        this.description = description;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }

    
    // Getter and Setter Methods
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String  getPackSize(){
        return packSize;
    }
    
    public void setPackSize(String packSize){
        this.packSize = packSize;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQoh() {
        return qoh;
    }

    public void setQoh(int qoh) {
        this.qoh = qoh;
    }

    // toString method for easy debugging
    @Override
    public String toString() {
        return "ItemDto{" +"itemCode='" + itemCode + '\'' +", description='" + description + '\'' +", PackSize='" + packSize+ ",unitPrice=" + unitPrice +", qoh=" + qoh +'}';
    }
}

