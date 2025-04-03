/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author sarasi-vidumini
 */
public class CustomerDto {
    private String CustId;
    private String CustTitle;
    private String CustName;
    private String DOB;
    private Double Salary;
    private String CustAddress;
    private String City;
    private String Province;
    private int PostalCode;
    
    public CustomerDto(){
        
    }

    public CustomerDto(String CustId, String CustTitle, String CustName, String DOB, Double Salary, String CustAddress, String City, String Province, int PostalCode) {
        this.CustId = CustId;
        this.CustTitle = CustTitle;
        this.CustName = CustName;
        this.DOB = DOB;
        this.Salary = Salary;
        this.CustAddress = CustAddress;
        this.City = City;
        this.Province = Province;
        this.PostalCode = PostalCode;
    }

    public String getCustId() {
        return CustId;
    }

    public void setCustId(String CustId) {
        this.CustId = CustId;
    }

    public String getCustTitle() {
        return CustTitle;
    }

    public void setCustTitle(String CustTitle) {
        this.CustTitle = CustTitle;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String CustName) {
        this.CustName = CustName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double Salary) {
        this.Salary = Salary;
    }

    public String getCustAddress() {
        return CustAddress;
    }

    public void setCustAddress(String CustAddress) {
        this.CustAddress = CustAddress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(int PostalCode) {
        this.PostalCode = PostalCode;
    }
    
    @Override
    public String toString() {
        return "CustomerDto{" +"CustId='" + CustId + '\'' +", CustTitle='" + CustTitle + '\'' +", CustName='" + CustName+ ",DOB=" + DOB +", Salary=" + Salary +",CustAddress"+CustAddress+",City"+City+",Province"+Province+",PostalCode"+PostalCode+'}';
        
    } 
    
}
