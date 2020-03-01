/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gproduct2;

import java.time.LocalDate;

/**
 *
 * @author user 2
 */
public class TabViewTank {
    private String productName,inStock,location; 
   private LocalDate lastSupply;
    private String volume;

    /**
     *
     * @param productName
     * @param volume
     * @param inStock
     * @param location
     * @param lastSupply
     */
    public TabViewTank(String productName, String volume, String inStock, String location, LocalDate lastSupply) {
        this.productName = productName;
        this.volume = volume;
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
    
    public String getvolume() {
        return volume;
    }

    public void setvolume(String productName) {
        this.volume = volume;
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
