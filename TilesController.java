/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gproduct3;

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author user 2
 */
public class TilesController implements Initializable {

    //table configuration
    
    @FXML private TableView<TabViewTile>tableView;
    @FXML private TableColumn<TabViewTile, String> productTypeColumn;
    @FXML private TableColumn<TabViewTile, String> colorColumn;
    @FXML private TableColumn<TabViewTile, String> inStockColumn;
    @FXML private TableColumn<TabViewTile, String> locationColumn;
    @FXML private TableColumn<TabViewTile, LocalDate> lastSupplyColumn;
   
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
         // column setup
       productTypeColumn.setCellValueFactory(new PropertyValueFactory<>("productType"));
       colorColumn.setCellValueFactory(new PropertyValueFactory<>("color"));
        inStockColumn.setCellValueFactory(new PropertyValueFactory<>("inStock"));
         locationColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
          lastSupplyColumn.setCellValueFactory(new PropertyValueFactory<>("lastSupply"));
          
          
          
        tableView.setItems(getTile()); 
        
        
    }
    
    public ObservableList<TabViewTile> getTile()
    {

        ObservableList<TabViewTile> tile = FXCollections.observableArrayList();
        tile.add(new TabViewTile("Floor", "Green","360", "Depot8", LocalDate.of(2019, Month.JANUARY, 31)));
        tile.add(new TabViewTile("Wall", "Grey", "240","Depot4", LocalDate.of(2019, Month.JULY, 4)));
        tile.add(new TabViewTile("Wall", "Brown","144", "Depot7", LocalDate.of(2018, Month.DECEMBER, 7)));
        tile.add(new TabViewTile("Floor", "Pink","180", "Depot9", LocalDate.of(2019, Month.FEBRUARY, 23)));
     
        return tile;
    }   
          
    
    
        
        
        
        
        
        
    }    
    

