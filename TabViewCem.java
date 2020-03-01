/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gproduct1;

import java.time.LocalDate;

/**
 *
 * @author user 2
 */
public class TabViewCem {
    
   private String productName,inStock,location; 
   private LocalDate lastSupply;

    public TabViewCem(String productName, String inStock, String location, LocalDate lastSupply) {
        this.productName = productName;
        this.inStock = inStock;
        this.location = location;
        this.lastSupply = lastSupply;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getLastSupply() {
        return lastSupply;
    }

    public void setLastSupply(LocalDate lastSupply) {
        this.lastSupply = lastSupply;
    }
    
    
    
    
    
}
