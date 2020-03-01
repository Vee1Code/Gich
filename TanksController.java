/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gproduct2;

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
public class TanksController implements Initializable {

   //table configuration
    
    @FXML private TableView<TabViewTank>tableView;
    @FXML private TableColumn<TabViewTank, String> productNameColumn;
    @FXML private TableColumn<TabViewTank, String> volumeColumn;
    @FXML private TableColumn<TabViewTank, String> inStockColumn;
    @FXML private TableColumn<TabViewTank, String> locationColumn;
    @FXML private TableColumn<TabViewTank, LocalDate> lastSupplyColumn;
    
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
         // column setup
       productNameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
       volumeColumn.setCellValueFactory(new PropertyValueFactory<>("volume"));
        inStockColumn.setCellValueFactory(new PropertyValueFactory<>("inStock"));
         locationColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
          lastSupplyColumn.setCellValueFactory(new PropertyValueFactory<>("lastSupply"));
          
          
          
        tableView.setItems(getTank()); 
        
        
    }
    
    public ObservableList<TabViewTank> getTank()
    {

        ObservableList<TabViewTank> tank = FXCollections.observableArrayList();
        tank.add(new TabViewTank("Techno","3", "20000", "Mezzanine2", LocalDate.of(2019, Month.SEPTEMBER, 21)));
        tank.add(new TabViewTank("AquaFirm","4", "5000", "Mezzanine 5", LocalDate.of(2019, Month.MARCH, 3)));
        tank.add(new TabViewTank("CLearWaters","1", "210", "Mezzanine6", LocalDate.of(2019, Month.OCTOBER, 15)));
        tank.add(new TabViewTank("Roto","8", "32000", "Mezzanine2", LocalDate.of(2019, Month.APRIL, 5)));
     
        return tank;
    }   
          
        
        
        
        
        
    }    
    

