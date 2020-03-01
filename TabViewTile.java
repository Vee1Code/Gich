/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gproduct3;

import java.time.LocalDate;

/**
 *
 * @author user 2
 */
public class TabViewTile {
   private String productType,color,inStock,location; 
   private LocalDate lastSupply;

    public TabViewTile(String productType,String color, String inStock, String location, LocalDate lastSupply) {
        this.productType = productType;
        this.color = color;
        this.inStock = inStock;
        this.location = location;
        this.lastSupply = lastSupply;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
    
     public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
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
